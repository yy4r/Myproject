package com.example.jack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/4/14 16:21
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String test(){
        System.out.println("hello");
        return "hello";
    }
}
