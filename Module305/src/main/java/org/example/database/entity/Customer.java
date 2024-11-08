package org.example.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.awt.print.Book;

@Entity
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sales_rep_employee_id", nullable = false)
    @ToString.Exclude
    private Employee employee;

    // now that we have the @ManyToOne mapping using the sam column name for the @JoinColumn
    // hibernate is confused as the column sales_re_employee_id is ambiguous to hibernate
    // to solve this problem, we make this field read only by adding insertable = false and updatable = false
    // TL;DR; - The foreign key must be marked as read only for hibernate
    @Column(name = "sales_rep_employee_id", insertable = false, updatable = false)
    private int salesRepEmployeeId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "contact_lastname")
    private String contactLastname;

    @Column(name = "contact_firstname")
    private String contactFirstname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address_line1")
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "country")
    private String country;

    @Column(name = "credit_limit", columnDefinition = "DECIMAL")
    private double creditLimit;
}
