//package com.example.demo.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.time.LocalDate;
//
////@RestController
//@Controller
//@RequestMapping("/api")
//public class DemoControlller {
//
//    // return current date
//    @RequestMapping(value = "/v1/datetime", method = RequestMethod.GET)
//    public @ResponseBody String getDateTime() {
//        return LocalDate.now().toString();
//    }
//
//    // return name passed in path
//    @RequestMapping(value = "/v1/{name}", method = RequestMethod.GET)
//    public @ResponseBody String getName(@PathVariable String name) {
//        return name;
//    }
//
//    // return address passed in path
//}
