package com.example.demo.impl;

import com.example.demo.dto.UserDTO;

public interface IUserService {

    UserDTO save(UserDTO userDTO);

    UserDTO update(UserDTO userDTO);

    UserDTO delete(int[] id);
}
