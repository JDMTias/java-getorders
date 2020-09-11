package com.lambdaschool.getorders2.services;

import com.lambdaschool.getorders2.models.Payment;
import com.lambdaschool.getorders2.repositories.PaymentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "paymentServices")
public class PaymentServicesImpl implements PaymentServices {

    @Autowired
    PaymentRepositories paymentsrepos;

    @Override
    public Payment save(Payment payment) {return paymentsrepos.save(payment);}

}
