package com.kuroiwa.springboot.mybootapp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("")
    public String index() {
        return "Hello Spring Boot World!!";
    }

    @RequestMapping("/{num}")
    public String index(@PathVariable int num) {
        int res = 0;
        for (int i = 1; i <= num; num++) {
            res += i;
        }
        return "total:" + res;
    }
}
