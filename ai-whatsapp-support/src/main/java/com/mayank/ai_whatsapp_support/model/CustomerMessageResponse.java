package com.mayank.ai_whatsapp_support.model;

public class CustomerMessageResponse {

    private String message;
    private Long messageId;
    private String status;

    public CustomerMessageResponse(String message, Long messageId, String status) {
        this.message = message;
        this.messageId = messageId;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public Long getMessageId() {
        return messageId;
    }

    public String getStatus() {
        return status;
    }
}