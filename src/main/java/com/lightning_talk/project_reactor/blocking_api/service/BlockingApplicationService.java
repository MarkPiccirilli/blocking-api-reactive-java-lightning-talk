package com.lightning_talk.project_reactor.blocking_api.service;

import com.lightning_talk.project_reactor.blocking_api.client.BlockingClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlockingApplicationService {
    private final BlockingClient blockingClient;

    public String getInfo() {
        return blockingClient.getResponse();
    }
}
