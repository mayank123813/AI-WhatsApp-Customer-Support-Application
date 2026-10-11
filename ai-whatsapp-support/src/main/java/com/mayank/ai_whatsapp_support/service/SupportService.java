package com.mayank.ai_whatsapp_support.service;

import com.mayank.ai_whatsapp_support.entity.CustomerMessageEntity;
import com.mayank.ai_whatsapp_support.model.CustomerMessage;
import com.mayank.ai_whatsapp_support.model.CustomerMessageResponse;
import com.mayank.ai_whatsapp_support.repository.CustomerMessageRepository;
import org.springframework.stereotype.Service;

@Service
public class SupportService {
    private final CustomerMessageRepository customerMessageRepository;
    public SupportService(CustomerMessageRepository customerMessageRepository){
        this.customerMessageRepository=customerMessageRepository;
    }

    public CustomerMessageResponse processMessage(CustomerMessage message) {


        if (message.getMessage() == null ||
                message.getMessage().trim().isEmpty()) {

            return new CustomerMessageResponse(
                    "Please enter a message.",
                    null,
                    "FAILED"
            );
        }
        CustomerMessageEntity entity = new CustomerMessageEntity();
        entity.setPhoneNumber(message.getPhoneNumber());
        entity.setMessage(message.getMessage());

        CustomerMessageEntity savedMessage=customerMessageRepository.save(entity);

        return  new CustomerMessageResponse(
                "Message saved successfully",
                savedMessage.getId(),
                "SUCCESS"
        );
    }
}
