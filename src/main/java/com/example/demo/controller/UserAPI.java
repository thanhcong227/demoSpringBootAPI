package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.impl.IUserService;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // Dùng để đánh dấu đây là một Restful API
public class UserAPI {

    @Autowired // Tiêm UserRepository vào đây
    private IUserService userService;

    @PostMapping(value = "/new") // Đường dẫn để truy cập API này
    public UserDTO createNew(@RequestBody UserDTO newDTO) {
        return userService.save(newDTO);
    } // localhost:8080/new (POST) -> Body -> raw -> JSON -> {"name": "Nguyen Van A", "address": "Ha Noi"}

    @PutMapping(value = "/new")
    public UserDTO updateNew(@RequestBody UserDTO newDTO) {
        return userService.update(newDTO);
    } // localhost:8080/new (PUT) -> Body -> raw -> JSON -> {"id": 1, "name": "Nguyen Van A", "address": "Ha Noi A"}

    @DeleteMapping(value = "/new")
    public void deleteNew(@RequestBody int[] ids) {
        userService.delete(ids);
    } // localhost:8080/new (DELETE) -> Body -> raw -> JSON -> [1, 2, 3]

    private UserRepository userRepository;

    public UserAPI(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Get the company details by ID
    @GetMapping("/user/{id}")
    public User getCompanyById(
            @PathVariable(value = "id") int id)
    {
        return userRepository.findById(id);
    }
}
