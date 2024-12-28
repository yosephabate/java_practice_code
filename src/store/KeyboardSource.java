package store;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class KeyboardSource implements ProductSource {

    public KeyboardSource() {

    }

    @Override
    public List<Product> getProducts() throws ProductException {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        try {
            System.out.print("Product Name:  ");
            String name = sc.next();

            System.out.print("Product Price: ");
            double price = sc.nextDouble();

            products.add(new Product(name, price));
        } catch (InputMismatchException e) {
            throw new ProductException("Price is invalid!");
        }

        return products;
    }
}
