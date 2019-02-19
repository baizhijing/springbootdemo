package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:bai
 * @data:2019/2/18
 **/

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index(){
        return "hello world";
    }
}
