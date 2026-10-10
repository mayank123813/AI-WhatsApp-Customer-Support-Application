package com.mayank.ai_whatsapp_support.repository;

import com.mayank.ai_whatsapp_support.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {
}
