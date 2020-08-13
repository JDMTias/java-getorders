package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Customer;
import com.lambdaschool.javaorders.views.OrderCounts;

import java.util.List;

public interface CustomerServices {
    Customer save(Customer customer);

    List<Customer> findAllCustomers();

    Customer findByCustomerCode(long id);

    List<Customer> findAllCustomersByNameLike(String custname);

//    List<OrderCounts> getOrderCounts();

}
