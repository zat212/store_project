package com.storesystem.Repository;

import com.storesystem.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("SELECT c FROM Customer c WHERE c.cusFullName LIKE %?1% OR c.cusEmail LIKE %?1%")
    List<Customer> findByKeyword(String keyword);
}
