package org.example.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "prductline_id")
    private int productLineId;

    @Column(name = "product_scale")
    private int productScale;

    @Column(name = "product_vendor")
    private String productVendor;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "quantity_in_stock")
    private int quantityInStock;

    @Column(name = "buy_price", columnDefinition = "DECIMAL")
    private double buyPrice;

    @Column(name = "msrp", columnDefinition = "DECIMAL")
    private double msrp;
}
