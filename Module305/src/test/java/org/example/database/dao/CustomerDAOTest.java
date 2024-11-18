package org.example.database.dao;
import org.example.database.entity.Customer;
import org.example.database.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CustomerDAOTest {

    private CustomerDAO customerDAO = new CustomerDAO();
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    @Test
    public void findCustomerById() {
        // given
        int givenCustomerId = 125;

        // when
        Customer actual = customerDAO.findCustomerById(givenCustomerId);

        // then
        Assertions.assertEquals("Havel & Zbyszek Co", actual.getCustomerName());
        Assertions.assertEquals(givenCustomerId, actual.getId());
        Assertions.assertEquals(0.00, actual.getCreditLimit());
    }

    @Test
    public void createCustomer() {
        // given
        Customer given = new Customer();

        given.setCustomerName("New Customer");
        given.setContactFirstname("Ben");
        given.setContactLastname("Davis");
        given.setPhone("676746647");
        given.setAddressLine1("address line 1");
        given.setAddressLine2("address line 2");
        given.setCity("Dallas");
        given.setState("Arizona");
        given.setPostalCode("zip code");
        given.setCountry("USA");
        given.setCreditLimit(243.55);

        Employee employee = employeeDAO.findEmployeeById(1216);
        given.setEmployee(employee);

        // when
        Assertions.assertNull(given.getId());
        Customer actual = customerDAO.createCustomer(given);

        // then
        Assertions.assertNotNull(actual.getId());
        Assertions.assertNull(actual.getSalesRepEmployeeId());
        Assertions.assertEquals(given.getContactFirstname(), actual.getContactFirstname());
        Assertions.assertEquals(given.getContactLastname(), actual.getContactLastname());
        Assertions.assertEquals(employee.getId(), actual.getEmployee().getId());


    }

    @ParameterizedTest
    @CsvSource({
            "103, Atelier graphique",
            "112, Signal Gift Stores",
            "114, 'Australian Collectors, Co.'"
    })
    public void findByIdTest(int customerId, String customerName) {
        // this is not a very good test .. just doing it to show how this works
        // given

        // when
        Customer actual = customerDAO.findCustomerById(customerId);

        // then
        Assertions.assertEquals(customerName, actual.getCustomerName());
    }
}
