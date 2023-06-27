package com.example.demo.impl;

import com.example.demo.converter.UserConverter;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Đánh dấu đây là một Spring SERVICE, Spring SERVICE là một Spring BEAN đặc biệt, nó được sử dụng để chứa các logic xử lý phức tạp
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Override
    // Lưu thông tin user vào database (tương đương với việc tạo mới user)
    public UserDTO save(UserDTO userDTO) {
        User user;
        if (userDTO.getId() != 0) {
            User oldUser = userRepository.findById(userDTO.getId());
            user = userConverter.toEntity(userDTO, oldUser);
        } else {
            user = userConverter.toEntity(userDTO, null);
        }
        user = userRepository.save(user);
        return userConverter.toDTO(user);
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        User oldUser = userRepository.findById(userDTO.getId());
        User user = userConverter.toEntity(userDTO, oldUser);
        user = userRepository.save(user);
        return userConverter.toDTO(user);
    }

    @Override
    public UserDTO delete(int[] id) {
        UserDTO userDTO = new UserDTO();
        for (int i = 0; i < id.length; i++) {
            User oldUser = userRepository.findById(id[i]);
            if (oldUser != null) {
                userRepository.delete(oldUser);
                userDTO = userConverter.toDTO(oldUser);
            }
        }
        return userDTO;
    }
}
