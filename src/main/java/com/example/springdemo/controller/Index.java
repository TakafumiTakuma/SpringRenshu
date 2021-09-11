package com.example.springdemo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

    @RequestMapping(value = "/{num}")
    public String index(@PathVariable int num){
       int res = 0;

       for(int i = 1;i <= num; i++)
           res += i;

           return "total;" + res;


    }

}
