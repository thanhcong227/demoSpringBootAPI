package com.example.demo.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data // Tự động tạo getter, setter
public class UserDTO {

    @Id // Khai báo đây là primary key
    @GeneratedValue(strategy= GenerationType.AUTO) // Tự động tăng
    private int id;
    private String name;
    private String address;


    public UserDTO() {
    }

}
