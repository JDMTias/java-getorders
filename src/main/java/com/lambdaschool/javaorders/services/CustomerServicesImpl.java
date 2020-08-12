package com.lambdaschool.javaorders.services;


import com.lambdaschool.javaorders.models.Customer;
import com.lambdaschool.javaorders.repositories.CustomersRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "customerServices")
public class CustomerServicesImpl implements CustomerServices
{
    @Autowired
    CustomersRepositories custrepo;
    @Override
    public Customer save(Customer customer)
    {
        return custrepo.save(customer);
    }
}
