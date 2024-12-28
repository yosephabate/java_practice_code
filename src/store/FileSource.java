package store;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FileSource implements ProductSource {
    private String filePath;

    public FileSource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<Product> getProducts() throws ProductException {
        List<Product> products = new ArrayList<>();

        try (
                BufferedReader br = new BufferedReader(new FileReader(filePath))
        ) {

            String line = br.readLine();
            while (line != null) {
                StringTokenizer st = new StringTokenizer(line, "$");
                while (st.hasMoreTokens()) {
                    String name = st.nextToken();
                    double price = Double.parseDouble(st.nextToken());

                    products.add(new Product(name, price));
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new ProductException("File Not Found!");
        } catch (IOException e) {
            throw new ProductException("I/O Operation Failed!");
        }

        return products;
    }
}
