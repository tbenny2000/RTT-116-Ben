package com.example.module309.controller;

import com.example.module309.database.dao.CustomerDAO;
import com.example.module309.database.dao.EmployeeDAO;
import com.example.module309.database.entity.Customer;
import com.example.module309.database.entity.Employee;
import com.example.module309.form.CreateCustomerFormBean;
import jakarta.validation.Valid;
import lombok.extern.apachecommons.CommonsLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

// server of the error message increases going down
// as developers 90% of the time we are going to use DEBUG
// TRACE   -- this is very low level and not often used by us. more for creators of libraries
// DEBUG   -- this is what we use most of the time when we want to print out stuff that helps us build
// INFO    -- this is for information that is important like the messages that spring prints when it starts up
// WARN    -- this is a potential problem or something of note, but it is not an error
// ERROR   -- this is for errors like making an api call that failed OR if an exception is thrown


// slf4j is not an implementation of logging it is a specification
// most if not all other logging libraries have come to use this specification for their implementation
// log4j was the most commonly used logging library for a long time and you will probably encounter it
//@Slf4j  <-  this is from lombok and all it does is line 40

//@Slf4j

@CommonsLog
@Controller
public class CustomerController {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerDAO customerDAO;
    @Autowired
    private EmployeeDAO employeeDAO;



    @PreAuthorize("hasAuthority('USER')")
    @GetMapping("/customer/search")
    public ModelAndView searchCustomer(@RequestParam(required = false) String firstName) {
        ModelAndView response = new ModelAndView();

        // /WEB-INF/jsp/customer/search.jsp
        response.setViewName("customer/search");

        // add the search field to the model
        response.addObject("search", firstName);

        if ( firstName != null ) {
            List<Customer> customers = customerDAO.findByFirstname(firstName);
            response.addObject("customersKey", customers);
        }
        return response;
    }



    // =================== 111111111111111
    @GetMapping("/customer/create")
    public ModelAndView createCustomer() {
        ModelAndView response = new ModelAndView();

        List<Employee> employees = employeeDAO.findAllEmployees();
        response.addObject("employeesKey", employees);

        LOG.debug("DEBUG LEVEL");
        LOG.info("INFO LEVEL");
        LOG.warn("WARNING LEVEL");
        LOG.error("ERROR LEVEL");

        response.setViewName("customer/create");

        return response;
    }

    // ================ 22222222222222222 ====================
    @GetMapping("/customer/edit/{customerId}")
    public ModelAndView editCustomer(@PathVariable Integer customerId) {
        ModelAndView response = new ModelAndView();

        response.setViewName("customer/create");

        LOG.debug("============== EDITING CUSTOMER" + customerId);

        Customer customer = customerDAO.findById(customerId);

        CreateCustomerFormBean form = new CreateCustomerFormBean();

        form.setId(customer.getId());
        form.setCompanyName(customer.getCustomerName());
        form.setFirstName(customer.getContactFirstname());
        form.setLastName(customer.getContactLastname());
        form.setPhone(customer.getPhone());
        form.setAddressLine1(customer.getAddressLine1());
        form.setCity(customer.getCity());
        form.setCountry(customer.getCountry());
        //form.setEmployeeId(customer.getSalesRepEmployeeId());
        // alternate form.setEmployeeId(customer.getEmployee().getId());

        response.addObject("form", form);

        List<Employee> employees = employeeDAO.findAllEmployees();
        response.addObject("employeesKey", employees);

        return response;
    }



    // ==================== 333333333333 =====================
    @GetMapping("/customer/createCustomer")
    public ModelAndView createCustomerSubmit(@Valid CreateCustomerFormBean form, BindingResult bindingResult) {
        // this is called when the user clicks the submit button on the form
        ModelAndView response = new ModelAndView();

        LOG.debug(form.toString());

        // System.out.println(form); the system print out is forbidden from now on
        if (bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                LOG.debug(error.toString());
            }
            response.setViewName("customer/create");
            response.addObject("bindingResult", bindingResult);
            response.addObject("form", form);

            List<Employee> employees = employeeDAO.findAllEmployees();
            response.addObject("employeesKey", employees);
        } else {
            // when this is a create the id in the form will be null
            // when it is an edit the id in the form will be populated with the PK to edit
            // in either case we can tey to query the DB and its either found or not
            // if its not found in the DB its a create
            // if it is found in the DB than its an edit
            Customer customer = customerDAO.findById(form.getId());
            if (customer == null) {
                customer = new Customer();
            }

            customer.setCustomerName(form.getCompanyName());
            customer.setContactFirstname(form.getFirstName());
            customer.setContactLastname(form.getLastName());
            customer.setPhone(form.getPhone());
            customer.setAddressLine1(form.getAddressLine1());
            customer.setCity(form.getCity());
            customer.setCountry(form.getCountry());

            Employee employee = employeeDAO.findById(form.getEmployeeId());
            customer.setEmployee(employee);

            customerDAO.save(customer);

            LOG.debug("============== SAVING CUSTOMER " + customer.getId());

            // in either case create or edit I now want to redirect to the edit url
            response.setViewName("redirect:/customer/edit/" + customer.getId());
        }
        return response;
    }
}
