package com.mayank.ai_whatsapp_support.service;

import com.mayank.ai_whatsapp_support.entity.CustomerMessageEntity;
import com.mayank.ai_whatsapp_support.model.CustomerMessage;
import com.mayank.ai_whatsapp_support.repository.CustomerMessageRepository;
import org.springframework.stereotype.Service;

@Service
public class SupportService {
    private final CustomerMessageRepository customerMessageRepository;
    public SupportService(CustomerMessageRepository customerMessageRepository){
        this.customerMessageRepository=customerMessageRepository;
    }

    public String processMessage(CustomerMessageEntity message) {


        if (message.getMessage() == null ||
                message.getMessage().trim().isEmpty()) {

            return "Please enter a message.";
        }
        CustomerMessageEntity savedMessage=customerMessageRepository.save(message);

        return "Your message has been received: "
                + message.getMessage();
    }
}
