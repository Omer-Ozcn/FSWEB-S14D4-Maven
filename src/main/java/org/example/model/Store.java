package org.example.model;

public class Store {

    public static void main(String[] args) {
        ProductForSale[] items = new ProductForSale[] {
                new Chocolate("Dark 70%", 89.90, "Bitter chocolate", 70),
                new Coke("Cola", 24.50, "Sparkling drink", 330, false),
                new Bread("Village Bread", 19.00, "Daily baked bread", 400, true)
        };

        listProducts(items);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale p : products) {
            p.showDetails();
        }
    }
}
