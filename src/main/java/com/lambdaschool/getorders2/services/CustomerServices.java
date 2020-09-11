package com.lambdaschool.getorders2.services;

import com.lambdaschool.getorders2.models.Customer;

import java.util.List;

public interface CustomerServices {
    Customer save(Customer customer);

    List<Customer> findAllCustomers();

    Customer findByCustomerCode(long id);

    List<Customer> findAllCustomersByNameLike(String custname);

}
