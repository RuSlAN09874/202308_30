package org.example.homeWork.shop;

import java.util.ArrayList;
import java.util.List;

public class ShopManager {
    List<Product> products = new ArrayList();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void getProductsByCategory(ProductCategory category) {
        List<Product> productsByCategory = new ArrayList<>();
        for (Product product : this.products) {
            if (product.category == category) {
                productsByCategory.add(product);
            }
        }
        System.out.println(productsByCategory);
    }

    public void getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) {
        List<Product> productsInPriceRange = new ArrayList<>();
        for (Product product : this.products) {
            if (product.currency == currency && product.price >= minPrice && product.price <= maxPrice) {
                productsInPriceRange.add(product);
            }
        }
    }
}