package org.example.database.dao;

import org.example.database.entity.Customer;
import org.example.database.entity.Employee;
import org.junit.jupiter.api.*;

import java.util.List;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class EmployeeDAOTest {

    private EmployeeDAO employeeDAO = new EmployeeDAO();
    private CustomerDAO customerDAO = new CustomerDAO();


    @Test
    public void findEmployeeById() {
        // given
        int givenEmployeeId = 1165;
        String expectedFirstName = "Leslie";

        // when
        Employee actual = employeeDAO.findEmployeeById(givenEmployeeId);

        // then
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(expectedFirstName, actual.getFirstName(), expectedFirstName);
        Assertions.assertEquals(givenEmployeeId, actual.getId(), givenEmployeeId);
    }

    @Test
    public void findByFirstName() {
        // given
        String givenEmployeeFirstName = "Leslie";
        int expectedCount = 2;

        // when
        List<Employee> actualList = employeeDAO.findByFirstName(givenEmployeeFirstName);

        // then
        Assertions.assertNotNull(actualList);
        Assertions.assertEquals(expectedCount, actualList.size());

    }
}
