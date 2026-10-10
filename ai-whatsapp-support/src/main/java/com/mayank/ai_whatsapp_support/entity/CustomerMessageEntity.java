
package com.mayank.ai_whatsapp_support.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
// Marks this class as a JPA entity.

@Table(name = "customer_messages")
// Maps this class to the customer_messages table in MySQL.

public class CustomerMessageEntity {

    @Id
    // Marks id as the primary key.

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Lets MySQL generate the ID automatically.

    private Long id;

    private String phoneNumber;
    // Stores the customer's phone number.

    private String message;
    // Stores the customer's message text.


    // No-argument constructor required by JPA.
    public CustomerMessageEntity() {
    }

    // Getter and setter for id
    public Long getId() {
        return id;
    }

    // Getter and setter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter and setter for message
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

