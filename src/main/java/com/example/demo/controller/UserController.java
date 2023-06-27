//package com.example.demo.controller;
//
//import com.example.demo.entity.User;
//import com.example.demo.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//public class UserController {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    // Get All Notes
//    @GetMapping("/user")
//    public List<User> getAllNotes()
//    {
//        return userRepository.findAll();
//    }
//
//    // Get the company details by ID
//    @GetMapping("/user/{id}")
//    public User getCompanyById(
//            @PathVariable(value = "id") int id)
//    {
//        return userRepository.findById(id);
//    }
//
//    @PostMapping("/user/add")
//    @ResponseStatus(HttpStatus.CREATED)
//    public User addCompany(
//            @RequestBody User company)
//    {
//        return userRepository.save(company);
//    }
//
//    @RequestMapping(value = "/user/delete/{id}", method = RequestMethod.DELETE)
////    @DeleteMapping("/user/delete/{id}")
//    public void deleteStudent(
//            @PathVariable(value = "id") int id)
//    {
//        userRepository.deleteById(id);
//    }
//
//    @PutMapping("/user/{id}")
//    public ResponseEntity<Object> updateStudent(
//            @RequestBody User company,
//            @PathVariable int id)
//    {
//
//        Optional<User> companyRepo
//                = Optional.ofNullable(
//                userRepository.findById(id));
//
//        if (!companyRepo.isPresent())
//            return ResponseEntity
//                    .notFound()
//                    .build();
//
//        company.setId(id);
//
//        userRepository.save(company);
//
//        return ResponseEntity
//                .noContent()
//                .build();
//    }
//
//}
