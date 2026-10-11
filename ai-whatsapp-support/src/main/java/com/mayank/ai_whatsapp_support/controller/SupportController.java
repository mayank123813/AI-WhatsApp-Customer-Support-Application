package com.mayank.ai_whatsapp_support.controller;

import com.mayank.ai_whatsapp_support.entity.CustomerMessageEntity;
import com.mayank.ai_whatsapp_support.model.CustomerMessage;
import com.mayank.ai_whatsapp_support.model.CustomerMessageResponse;
import com.mayank.ai_whatsapp_support.service.SupportService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SupportController {
    private final SupportService supportService;
    public SupportController(SupportService supportService){
        this.supportService=supportService;
    }

    @GetMapping("/hello")
    public String hello(){
        return "return customer ai support system";
    }
    @PostMapping("/message")
    public CustomerMessageResponse receiveMessage(@RequestBody CustomerMessage message){
        return supportService.processMessage(message);
    }

}