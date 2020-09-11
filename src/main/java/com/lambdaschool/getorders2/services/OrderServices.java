package com.lambdaschool.getorders2.services;

import com.lambdaschool.getorders2.models.Order;

public interface OrderServices {
    Order findByOrderNum(long id);
}
