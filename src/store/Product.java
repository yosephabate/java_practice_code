package store;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        if (name == null) throw new NullPointerException("Product name is null!");
        if (price < 0) throw new IllegalArgumentException("Product price is negative!");

        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Product[name=%s, price=%.2f]", name, price);
    }
}
