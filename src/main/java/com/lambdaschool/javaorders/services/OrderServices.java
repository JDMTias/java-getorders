package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Order;

public interface OrderServices {
    Order findByOrderNum(long id);
}
