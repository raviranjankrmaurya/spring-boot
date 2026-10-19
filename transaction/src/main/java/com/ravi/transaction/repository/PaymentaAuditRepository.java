package com.ravi.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ravi.transaction.entity.PaymentAudit;

@Repository 
public interface PaymentaAuditRepository extends JpaRepository<PaymentAudit,Long>{
    
}
