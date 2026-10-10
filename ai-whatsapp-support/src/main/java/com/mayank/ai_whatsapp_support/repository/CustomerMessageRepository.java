package com.mayank.ai_whatsapp_support.repository;

import com.mayank.ai_whatsapp_support.entity.CustomerMessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerMessageRepository extends JpaRepository<CustomerMessageEntity,Long>{

}
