package com.lambdaschool.javaorders.repositories;

import com.lambdaschool.javaorders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepositories extends CrudRepository<Order, Long> {
}
