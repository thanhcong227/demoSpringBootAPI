package com.example.demo.converter;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import org.springframework.stereotype.Component;

@Component // Đánh dấu đây là một Spring BEAN
public class UserConverter {

    public User toEntity(UserDTO userDTO, User oldUser) {
        User user = new User();
        if (oldUser != null) {
            user.setId(oldUser.getId());
        }
        user.setName(userDTO.getName());
        user.setAddress(userDTO.getAddress());
        return user;
    }

    public UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setAddress(user.getAddress());
        return userDTO;
    }
}
