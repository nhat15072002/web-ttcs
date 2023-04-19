package com.example.web.reponsitory;

import com.example.web.entity.products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productsReponsitory extends JpaRepository< products,Long> {

}
