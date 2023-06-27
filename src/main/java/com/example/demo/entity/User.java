package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "student")
@Data
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO) // Tự động tăng
    private int id;
    private String name;
    private String address;

    public User() {}

}
