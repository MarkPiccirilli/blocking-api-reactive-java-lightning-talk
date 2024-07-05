package com.lightning_talk.project_reactor.blocking_api.controller;

import com.lightning_talk.project_reactor.blocking_api.service.BlockingApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("blocking-api")
public class BlockingApplicationController {
    private final BlockingApplicationService blockingApplicationService;

    @GetMapping("get-response")
    public String getResponse() {
        return blockingApplicationService.getInfo();
    }
}
