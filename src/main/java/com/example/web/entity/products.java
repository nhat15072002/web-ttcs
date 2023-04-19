package com.example.web.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "products")
@NoArgsConstructor
public class products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String proName;
    @Column
    private Long proCategoryId;
    @Column
    private Double proPrice;
    @Column
    private Long proNumber;
    @Column
    private String proDescription;
    @Column
    private String proSize;


}
