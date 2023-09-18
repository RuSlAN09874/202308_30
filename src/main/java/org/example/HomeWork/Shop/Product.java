package org.example.HomeWork.Shop;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}


