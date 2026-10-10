package com.mayank.ai_whatsapp_support.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "customer_messages")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phoneNumber;
    private String message;
}
