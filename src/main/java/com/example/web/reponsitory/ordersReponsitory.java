package com.example.web.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.entity.orders;

public interface ordersReponsitory extends JpaRepository<orders,Long>{
    
}
