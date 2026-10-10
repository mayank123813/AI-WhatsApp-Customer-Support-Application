package com.mayank.ai_whatsapp_support.model;

import com.mayank.ai_whatsapp_support.entity.CustomerMessageEntity;
import com.mayank.ai_whatsapp_support.service.SupportService;

public class CustomerMessage {

    private String phoneNumber;
    private String message;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String  getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}