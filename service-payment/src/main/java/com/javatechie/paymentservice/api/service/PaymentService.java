package com.javatechie.paymentservice.api.service;

import com.javatechie.paymentservice.api.entity.Payment;
import com.javatechie.paymentservice.api.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public Payment doPayment(Payment payment){
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString());
        return repository.save(payment);
    }

    private String paymentProcessing(){
        //api should be 3rd party payment gateway (paypal,paytm)
        return new Random().nextBoolean()?"success":"false";
    }

    public Payment findPaymentHistoryByOrderId(int orderId) {
        return repository.findByOrderId(orderId);
    }
}
