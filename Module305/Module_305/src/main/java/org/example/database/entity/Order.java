package org.example.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "customer_id")
    private String customerId;


    @Column(name = "order_date", columnDefinition = "DATE")
    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @Column(name = "required_date", columnDefinition = "DATE")
    @Temporal(TemporalType.DATE)
    private Date requiredDate;

    @Column(name = "shipped_date", columnDefinition = "DATE")
    @Temporal(TemporalType.DATE)
    private Date shippedDate;

    @Column(name = "status")
    private String status;

    @Column(name = "comments")
    private String comments;

}
