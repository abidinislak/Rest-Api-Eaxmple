package com.restApiExample.demo.restController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {



    @GetMapping("/hello")

    public String getHello(){



        return "hello";
    }
}
