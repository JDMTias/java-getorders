package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Order;
import com.lambdaschool.javaorders.repositories.OrdersRepositories;
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
                .orElseThrow(() -> new EntityNotFoundException("Order " + id + " Not Found! "));
    }
}
