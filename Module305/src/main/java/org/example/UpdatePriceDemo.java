package org.example;

import org.example.database.dao.ProductDAO;
import org.example.database.entity.Product;

public class UpdatePriceDemo {

    public static void main(String[] args) {

        ProductDAO productDAO = new ProductDAO();
        Product p = productDAO.findById(1);
        p.setProductCode("ABC123");
        productDAO.update(p);

        Product p2 = productDAO.findById(2);
        System.out.println(p2);
        p2.setProductCode("Beni");
        productDAO.update(p2);
    }
}
