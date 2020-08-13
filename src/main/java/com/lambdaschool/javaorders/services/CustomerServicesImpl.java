package com.lambdaschool.javaorders.services;


import com.lambdaschool.javaorders.models.Customer;
import com.lambdaschool.javaorders.repositories.CustomersRepositories;
import com.lambdaschool.javaorders.views.OrderCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;


@Transactional
@Service(value = "customerServices")
public class CustomerServicesImpl implements CustomerServices
{
    @Autowired
    CustomersRepositories custrepo;
    @Transactional
    @Override
    public Customer save(Customer customer)
    {
        return custrepo.save(customer);
    }

    @Override
    public List<Customer> findAllCustomers() {
        List<Customer> list = new ArrayList<>();

        custrepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Customer findByCustomerCode(long id) {
        return custrepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer " + id + " Not Found! "));

    }

    @Override
    public List<Customer> findAllCustomersByNameLike(String custname) {
        return custrepo.findByCustnameContainingIgnoringCase(custname);
    }

//    this has to be changed or deleted.
//    @Override
//    public List<OrderCounts> getOrderCounts() {
//        List<OrderCounts> list = custrepo.findOrderCounts();
//        return list;
//    }


}
