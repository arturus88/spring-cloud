package com.as.payment_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentApi {

    @GetMapping
    public String hello(){
        return "Hallo payment_service";
    }
}
