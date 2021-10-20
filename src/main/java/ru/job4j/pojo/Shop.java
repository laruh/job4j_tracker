package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        for (int index = 0; index < products.length; index++) {
            if (products[index] == null) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product[] products = new Product[5];
        products[0] = milk;
        products[1] = bread;
        products[2] = egg;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            }
        }
    }
}
