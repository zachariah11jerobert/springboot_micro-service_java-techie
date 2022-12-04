package com.javatechie.paymentservice.api.controller;

import com.javatechie.paymentservice.api.entity.Payment;
import com.javatechie.paymentservice.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    public Payment doPayment(@RequestBody Payment payment){
        return service.doPayment(payment);
    }

}
