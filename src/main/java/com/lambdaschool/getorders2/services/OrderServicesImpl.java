package com.lambdaschool.getorders2.services;

import com.lambdaschool.getorders2.models.Order;
import com.lambdaschool.getorders2.repositories.OrdersRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "orderServices")
public class OrderServicesImpl implements OrderServices {

    @Autowired
    OrdersRepositories ordrepo;

    @Override
    public Order findByOrderNum(long id) {
        return ordrepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Order " + id + "Not Found!"));
    }

}
