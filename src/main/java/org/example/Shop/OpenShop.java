package org.example.Shop;


public class OpenShop {
    public static void main(String[] args) {
        ShopManager shopManager = new ShopManager();

        shopManager.addProduct(new Product("Ремень1", ProductCategory.Accesories, 30.34, Currency.USD, Size.M));
        shopManager.addProduct(new Product("Ремень2", ProductCategory.Accesories, 19.99, Currency.USD, Size.M));
        shopManager.addProduct(new Product("Ремень3", ProductCategory.Accesories, 1000, Currency.USD, Size.M));

        shopManager.addProduct(new Product("Куртка1", ProductCategory.Clothing, 130.00, Currency.EUR, Size.Xl));
        shopManager.addProduct(new Product("Куртка2", ProductCategory.Clothing, 219.99, Currency.EUR, Size.XXl));
        shopManager.addProduct(new Product("Куртка3", ProductCategory.Clothing, 100.00, Currency.EUR, Size.S));

        shopManager.addProduct(new Product("Джинсы1", ProductCategory.Jeans, 20.00, Currency.NZD, Size.L));
        shopManager.addProduct(new Product("Джинсы2", ProductCategory.Jeans, 24.99, Currency.NZD, Size.M));
        shopManager.addProduct(new Product("Джинсы3", ProductCategory.Jeans, 50.00, Currency.NZD, Size.S));

        shopManager.getProductsByCategory(ProductCategory.Clothing);
        System.out.println();
        shopManager.getProductsByPriceRange(20,220, Currency.USD);
    }

}



