package coffe_shop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ProductLoader {

    public List<Product> loadProducts() {
        // will read the products fro the file and return a list of products from the data
        List<Product> result = new ArrayList<>();

        try {
            // 1) Open the file to read from
            File file = new File("src/products.txt");

            // 2) Create the buffered reader
            BufferedReader br = new BufferedReader(new FileReader(file));

            // 3) read the file line by line to get our products
            String line;
            while ((line = br.readLine()) != null) {

                // 4) Tokenize the line that we just read from the file by splitting on a coma (,)
                String[] tokens = line.split(",");

                // 5) Create a product and set the values that we just "parsed" from the file
                Product p = new Product();
                p.setName(tokens[0]);
                p.setPrice(Double.parseDouble(tokens[1]));
                result.add(p);

                System.out.println(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        new ProductLoader().loadProducts();
    }
}
