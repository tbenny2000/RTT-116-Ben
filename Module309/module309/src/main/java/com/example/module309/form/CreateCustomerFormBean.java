package com.example.module309.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@Setter
@Getter
@ToString
public class CreateCustomerFormBean {
    private Integer id;

    // this is called a POJO - Plain Old Java Object
    // this object is called a FormBean
    // this is analogous to a DTO (Data Transport Object)
    // this is NEVER EVER an entity
    // the variable names here do need to match exactly what is in the name attribute on the HTML input field

    @Pattern(regexp = "[A-Za-z0-9\\s]+", message = "Company name must contain only letters, numbers, and spaces.")
    @Length(min = 3, max = 50, message = "Company Name must be b/w 3 and 50 characters.")
    @NotEmpty(message = "Company Name is required.")
    private String companyName;

    @Length(min = 3, max = 50, message = "First Name must be b/w 3 and 50 characters.")
    @NotEmpty(message = "First Name is required.")
    private String firstName;

    @Length(min = 3, max = 50, message = "Last Name must be b/w 3 and 50 characters.")
    @NotEmpty(message = "Last Name is required.")
    private String lastName;

    @Length(min = 3, max = 50, message = "Phone number must be b/w 3 and 50 characters.")
    @NotEmpty(message = "Phone number is required.")
    private String phone;

    @Length(min = 3, max = 50, message = "Address must be b/w 3 and 50 characters.")
    @NotEmpty(message = "Address is required.")
    private String addressLine1;

    @Length(min = 3, max = 50, message = "City must be b/w 3 and 50 characters.")
    @NotEmpty(message = "City is required.")
    private String city;

    @Length(min = 3, max = 50, message = "Country must be b/w 3 and 50 characters.")
    @NotEmpty(message = "Country is required.")
    private String country;

    private Integer employeeId;
}
