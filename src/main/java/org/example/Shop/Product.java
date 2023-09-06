package org.example.Shop;

public class Product {
    String name;
    ProductCategory category;
    double price;
    Currency currency;


    public Product(String name, ProductCategory category, double price, Currency currency, Size m) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", currency=" + currency +
                '}';
    }
}


