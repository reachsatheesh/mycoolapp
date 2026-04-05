package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" that return "Satheesh Hello World"
@GetMapping("/")
    public String sayHello(){

    return "Satheesh Says Hello World";
}



}
