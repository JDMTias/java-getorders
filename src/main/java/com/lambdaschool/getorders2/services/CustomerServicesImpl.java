package com.lambdaschool.getorders2.services;


import com.lambdaschool.getorders2.models.Customer;
import com.lambdaschool.getorders2.repositories.CustomerRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "customerServices")
public class CustomerServicesImpl implements CustomerServices {

    @Autowired
    CustomerRepositories custrepo;
    @Transactional
    @Override
    public Customer save(Customer customer) { return custrepo.save(customer);}

    @Override
    public List<Customer> findAllCustomers() {
        List<Customer> list = new ArrayList<>();

        custrepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Customer findByCustomerCode(long id) {
        return custrepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer " + id + " Not Found!"));
    }
    @Override
    public List<Customer> findAllCustomersByNameLike(String custname) {
        return custrepo.findByCustnameContainingIgnoringCase(custname);
    }

}
