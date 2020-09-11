package com.lambdaschool.getorders2.repositories;

import com.lambdaschool.getorders2.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepositories extends CrudRepository<Payment, Long> {

}
