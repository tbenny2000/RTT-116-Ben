package com.example.module309.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sales_rep_employee_id")
    @EqualsAndHashCode.Exclude
    private Employee employee;

    // now that we have the @ManyToOne mapping using the same column name for the @JoinColumn
    // hibernate is confused as the colum sales_rep_employee_id is not ambigous to hibernate
    // to solve this problem, we make this field read only by adding insertable = false and updateable = false
    // TL;DR; - The foreign key must be marked as read only for hibernate

    @Column(name = "sales_rep_employee_id", insertable = false, updatable = false)
    private Integer salesRepEmployeeId;

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


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", salesRepEmployeeId=" + salesRepEmployeeId +
                ", customerName='" + customerName + '\'' +
                ", contactLastName='" + contactLastname + '\'' +
                ", contactFirstName='" + contactFirstname + '\'' +
                ", phone='" + phone + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
