// C3304875
// Matthew Maiden
// Assignment Schema Link: https://uonline.newcastle.edu.au/bbcswebdav/pid-4033358-dt-content-rid-20497413_1/courses/CRS.126440.2019.S1/SENG1110_6110_Assign1-2019-s1%281%29.pdf

import java.util.*;

public class Depot {
    Scanner console = new Scanner(System.in);

    private String depotName;
    private String tempString;
    private double tempDouble;
    private int tempInt;
    private int productCount;
    private int selector;
    private Product product1, product2, product3;

    public void setName(String name) {
        depotName = name;
    }
    public String getName() {
        return depotName;
    }
    public void addProduct() {
        /* Constructors */
        depotName = "";
        tempString = "";
        tempDouble = 0.0;
        tempInt = 0;
        productCount = 0;
        selector = 0;

        System.out.println("[1]. Add Product\n[2]. Remove Product");
        System.out.print("Please Make a Selection: ");
        selector = Integer.parseInt(console.nextLine());

        if (selector == 1) {
            System.out.println("Product Slot: [1], [2] or [3]");
            System.out.print("Please Make a Selection: ");
            selector = Integer.parseInt(console.nextLine());
            if (selector == 1) {
                System.out.print("Product Name: ");
                tempString = console.nextLine();
                product1.setName(tempString);
                System.out.print("Product Price: $");
                tempDouble = Double.parseDouble(console.nextLine());
                product1.setPrice(tempDouble);
                System.out.print("Product Weight (kg): ");
                tempDouble = Double.parseDouble(console.nextLine());
                product1.setWeight(tempDouble);
                System.out.print("Product Quantity: ");
                tempInt = Integer.parseInt(console.nextLine());
                product1.setQuantity(tempInt);
                System.out.print("Depot [1] / [2]: ");
                tempInt = Integer.parseInt(console.nextLine());

            }
            else if (selector == 2) {
                System.out.print("Product Name: ");
                tempString = console.nextLine();
                product2.setName(tempString);
                System.out.print("Product Price: ");
                tempDouble = Double.parseDouble(console.nextLine());
                product2.setPrice(tempDouble);
                System.out.print("Product Weight: ");
                tempDouble = Double.parseDouble(console.nextLine());
                product2.setWeight(tempDouble);
                System.out.print("Product Quantity: ");
                tempInt = Integer.parseInt(console.nextLine());
                product2.setQuantity(tempInt);
                System.out.print("Depot [1] / [2]: ");
                tempInt = Integer.parseInt(console.nextLine());
                product2.setDepot(tempInt);
            }
            else if (selector == 3) {
                System.out.print("Product Name: ");
                tempString = console.nextLine();
                product3.setName(tempString);
                System.out.print("Product Price: ");
                tempDouble = Double.parseDouble(console.nextLine());
                product3.setPrice(tempDouble);
                System.out.print("Product Weight: ");
                tempDouble = Double.parseDouble(console.nextLine());
                product3.setWeight(tempDouble);
                System.out.print("Product Quantity: ");
                tempInt = Integer.parseInt(console.nextLine());
                product3.setQuantity(tempInt);
                System.out.print("Depot [1] / [2]: ");
                tempInt = Integer.parseInt(console.nextLine());
                product3.setDepot(tempInt);
            }
            else {
                System.out.printf("Invalid Selection %d", selector);
            }
        }
    }

}