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
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "check_number", columnDefinition = "DECIMAL")
    private double checkNumber;

    @Column(name = "payment_date", columnDefinition = "DATE")
    private Date paymentDate;

    @Column(name = "amount", columnDefinition = "DECIMAL")
    private double amount;
}
