package com.example.module309.database.dao;

import com.example.module309.database.entity.Customer;
import com.example.module309.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeDAO extends JpaRepository<Customer, Long> {
    @Query("select e from Employee e where e.firstName = :firstName")
    List<Employee> findByFirstName(String firstName);

    Employee findById(Integer id);

}





