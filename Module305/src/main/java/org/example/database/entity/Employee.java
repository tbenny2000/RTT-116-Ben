package org.example.database.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.query.Page;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    // the @Id tells hibernate that this is the primary key for this entity
    @Id
    // this tells hibernate that the database will auto increment the next Id for the new record in the DB
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // this defines the DB column
    @Column(name = "id")
    private int Id;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Customer> customers;

    @Column(name = "office_id")
    private int officeId;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "extension")
    private String extension;

    @Column(name = "email")
    private String email;

    @Column(name = "reports_to")
    private int reportsTo;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "vacation_hours")
    private int vacationHours;

    @Column(name = "profile_image_url")
    private String profileImageUrl;
}
