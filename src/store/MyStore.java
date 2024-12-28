package store;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MyStore {
    private List<Product> products;

    public MyStore() {
        products = new ArrayList<>();
    }

//    public void readProducts() throws ProductException {
//        Scanner sc = new Scanner(System.in);
//
//        try {
//            System.out.print("Product Name:  ");
//            String name = sc.next();
//
//            System.out.print("Product Price: ");
//            double price = sc.nextDouble();
//
//            products.add(new Product(name, price));
//        } catch (InputMismatchException e) {
//            throw new ProductException("Price is invalid!");
//        }
//    }

//    public void readProductsFromFile(String filePath) throws ProductException {
//        try (
//                BufferedReader br = new BufferedReader(new FileReader(filePath))
//                ) {
//
//            String line = br.readLine();
//            while (line != null) {
//                StringTokenizer st = new StringTokenizer(line, "$");
//                while (st.hasMoreTokens()) {
//                    String name = st.nextToken();
//                    double price = Double.parseDouble(st.nextToken());
//
//                    products.add(new Product(name, price));
//                }
//                line = br.readLine();
//            }
//        } catch (FileNotFoundException e) {
//            throw new ProductException("File Not Found!");
//        } catch (IOException e) {
//            throw new ProductException("I/O Operation Failed!");
//        }
//    }

    public void loadProducts(ProductSource source) throws ProductException {
        products.addAll(source.getProducts());
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        MyStore myStore = new MyStore();

        try {
//            for (int i = 0; i < 3; i++) {
//                myStore.readProducts();
//            }

//            myStore.readProductsFromFile("/Users/yosephabate/products.txt");

            ProductSource source = new FileSource("/Users/yosephabate/products.txt");
            myStore.loadProducts(source);

            myStore.displayProducts();
        } catch (ProductException e) {
            System.out.println(e.getMessage());
        }
    }
}
