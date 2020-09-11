package com.lambdaschool.getorders2.repositories;

import com.lambdaschool.getorders2.models.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepositories extends CrudRepository<Customer, Long> {
    @Query(value = "SELECT c.custname, count(ordnum) as countorders " +
            "FROM customers c LEFT JOIN orders o " +
            "ON c.custcode = o.custcode " +
            "GROUP BY c.custname " +
            "ORDER BY countorders desc", nativeQuery = true)

    List<Customer>findByCustnameContainingIgnoringCase(String likename);
}
