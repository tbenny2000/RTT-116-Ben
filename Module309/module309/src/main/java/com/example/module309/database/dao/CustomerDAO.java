package com.example.module309.database.dao;

import com.example.module309.database.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface CustomerDAO extends JpaRepository<Customer, Long> {
    @Query("select c from Customer c where c.contactFirstname = :firstName")
    List<Customer> findByFirstname(String firstName);

    List<Customer> findByContactLastname(String lastName);
}
