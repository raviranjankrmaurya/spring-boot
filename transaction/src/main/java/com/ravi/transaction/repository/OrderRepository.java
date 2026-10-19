package com.ravi.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ravi.transaction.entity.Order;
@Repository 
public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
