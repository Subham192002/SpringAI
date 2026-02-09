package com.example.chatgpt.controller;

import com.example.chatgpt.service.OpenAIService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
@CrossOrigin("*")
public class ChatController {

    private final OpenAIService openAIService;

    public ChatController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping
    public String chat(@RequestBody String message) {
        return openAIService.askChatGPT(message);
    }
}
