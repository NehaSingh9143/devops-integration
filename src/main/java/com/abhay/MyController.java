package com.abhay;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

public String sayHello(){
    return "hello from devops using jenkins pipeline";
}
}
