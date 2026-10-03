package com.example.ch10_ex6;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
