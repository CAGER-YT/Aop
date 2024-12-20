package com.example.AopExample;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@CrossOrigin(origins="*")
public class UserController {

    @GetMapping("/user/{name}/{age}")
    public String getName(@PathVariable String name,@PathVariable int age){
        System.out.println("APi is executed");
        return "Name:"+name+" age:"+age;
    }
}
