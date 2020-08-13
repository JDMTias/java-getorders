package com.lambdaschool.javaorders.repositories;

import com.lambdaschool.javaorders.models.Customer;
import com.lambdaschool.javaorders.views.OrderCounts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomersRepositories extends CrudRepository<Customer, Long> {
//

    @Query(value = "SELECT c.custname, count(ordnum) as countorders " +
            "FROM customers c LEFT JOIN orders o " +
            "ON c.custcode = o.custcode " +
            "GROUP BY c.custname " +
            "ORDER BY countorders desc", nativeQuery = true)
//    this one is still not working, assuming its a custom querry error.
    List<Customer> findByCustnameContainingIgnoringCase(String likename);

}
