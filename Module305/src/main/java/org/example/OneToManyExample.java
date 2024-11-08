package org.example;

import org.example.database.dao.CustomerDAO;
import org.example.database.dao.EmployeeDAO;
import org.example.database.entity.Customer;
import org.example.database.entity.Employee;

public class OneToManyExample {

    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        CustomerDAO customerDAO = new CustomerDAO();

        // when this runs hibernate runs the query
        Employee e = employeeDAO.findById(1501);
        System.out.println(e);

        for (Customer c : e.getCustomers()) {
            System.out.println(c);

            System.out.println(c.getEmployee());
        }

        // adding a new customer to this employee
        // first we creat the new customer entity and fill it up with data
        Customer newCustomer = new Customer();

        newCustomer.setCustomerName("New Customer");
        newCustomer.setContactFirstname("Ben");
        newCustomer.setContactLastname("Davis");
        newCustomer.setPhone("676746647");
        newCustomer.setAddressLine1("address line 1");
        newCustomer.setAddressLine2("address line 2");
        newCustomer.setCity("city");
        newCustomer.setState("state");
        newCustomer.setPostalCode("postal code");
        newCustomer.setCountry("country");
        newCustomer.setCreditLimit(243.55);
        newCustomer.setEmployee(e);

        // then we can  add the new customer to the list of existing customers for this employee
        e.getCustomers().add(newCustomer);

        // this is the best way to do this but want o show other hibernate features
        // customerDAO.createCustomer(newCustomer);

        // Then !!!!!!!! we sae the employee !!!!!!!
        employeeDAO.update(e);

    }
}
