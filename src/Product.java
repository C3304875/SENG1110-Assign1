// C3304875
// Matthew Maiden
// SENG1110

// This program makes use of TIO to enable a user
// to keep track of a small shopping centre inventory.

import java.util.Scanner;

public class Product {
    Scanner console = new Scanner(System.in);

    private String productName;
    private double price;
    private double weight;
    private int quantity;

    public Product() { // Constructor
        productName = "";
        price = 0;
        weight = 0;
        quantity = 0;
    }

    public void setName(String nm){ // Receive name from Interface
        productName = nm;
    }
    public void setPrice(double pr) {
        price = pr;
    }
    public void setWeight(double wt) {
        weight = wt;
    }
    public void setQuantity(int qt) {
        quantity = qt;
    }
    public void getInfo() { // Output all info
        System.out.printf("Product Name: %s\n", productName);
        System.out.printf("Product Weight: %f kg\n", weight);
        System.out.printf("Product Price: $%f\n", price);
        System.out.printf("Quantity: %d", quantity);
    }
    public String getName(){
        return productName;
    }
    public int getQuantity() { // Used for querys
    	return quantity;
	 }
	 public double getPrice() { // Used for querys
        return price;
    }
}