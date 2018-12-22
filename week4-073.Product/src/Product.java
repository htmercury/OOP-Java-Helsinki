/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kawon
 */
public class Product {
    private String name;
    private double price;
    private int amount;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }
    
    public void printProduct() {
        System.out.format("%s, price %f, amount %d\n", this.name, this.price, this.amount);
    }
}
