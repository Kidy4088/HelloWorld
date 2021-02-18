package com.kidy.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kidy
 * @date 21/2/18 018 18:09
 */
@RestController("/")
public class HelloWorldController {

    @Value("${hello-world.id}")
    private String id;

    @GetMapping("/")
    public String helloWorld() {
        return "HelloWorld:" + id;
    }

}