package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : JOHNNGUYEN
 * @since : 6/18/2025, Wed
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/data")
    public String getData() {
        return "This is the first message on ECS";
    }
}
