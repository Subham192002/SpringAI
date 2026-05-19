package com.example.chatgpt.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class OlllamaAIController {

    private final ChatClient chatClient;

    public OlllamaAIController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @PostMapping("/ask")
    public String ask(@RequestBody String message) {

        return chatClient.prompt()
                .user(message)
                .call()
                .content();
    }
}