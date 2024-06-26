package org.javaacademy.shop_service.entity;

import jakarta.persistence.*;

//@Entity
//@Table(name = "goods")
public class Good {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String name;
}
