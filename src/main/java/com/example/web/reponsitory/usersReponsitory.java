package com.example.web.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.entity.users;

public interface usersReponsitory extends JpaRepository<users,Long> {
    
}
