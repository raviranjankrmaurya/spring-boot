package com.ravi.transaction.service;

import org.springframework.stereotype.Service;

import com.ravi.transaction.entity.Order;
import com.ravi.transaction.entity.PaymentAudit;
import com.ravi.transaction.repository.PaymentaAuditRepository;

@Service 
public class PaymentAuditService {
    private PaymentaAuditRepository paymentaAuditRepository;

    public PaymentAuditService(PaymentaAuditRepository paymentaAuditRepository) {
        this.paymentaAuditRepository = paymentaAuditRepository;
    }
    public void audit(Order order){
        paymentaAuditRepository.save(new PaymentAudit(order.getAmount(), order.getId(), true));
    }
}
