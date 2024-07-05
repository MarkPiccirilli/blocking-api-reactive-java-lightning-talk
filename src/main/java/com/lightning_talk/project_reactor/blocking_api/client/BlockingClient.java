package com.lightning_talk.project_reactor.blocking_api.client;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class BlockingClient {
    private final RestTemplate restTemplate;

    public String getResponse() {
        return restTemplate.exchange(
                "https://us-central1-reactive-java-lightning-talk.cloudfunctions.net/test-function",
                HttpMethod.GET,
                new HttpEntity<>(new HttpHeaders()),
                new ParameterizedTypeReference<String>() { }
        ).getBody();
    }
}
