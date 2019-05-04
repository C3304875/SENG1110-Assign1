// C3304875
// Matthew Maiden
// Assignment Schema Link: https://uonline.newcastle.edu.au/bbcswebdav/pid-4033358-dt-content-rid-20497413_1/courses/CRS.126440.2019.S1/SENG1110_6110_Assign1-2019-s1%281%29.pdf

import java.util.*;

public class Interface {
    Scanner console = new Scanner(System.in);

    private String tempString;
    private int tempInt;
    private float tempFloat;
    private Depot depot1, depot2;
    private Product product1, product2, product3;

    private void depotManagement(){
        Scanner console = new Scanner(System.in);
        Depot depot1 = new Depot();
        Depot depot2 = new Depot();

        while (true) {
            int selector;

            System.out.println("[1]. Add Depot\n[2]. Remove Depot");
            System.out.print("\nPlease Make a Selection: ");
            selector = Integer.parseInt(console.nextLine());

            switch (selector) {
                case 1:
                    System.out.print("Add Depot [1] / [2]: ");
                    System.out.print("\nPlease Make a Selection: ");
                    selector = Integer.parseInt(console.nextLine());

                    switch (selector) {
                        case 1:
                            System.out.print("Depot Name: ");
                            tempString = console.nextLine();
                            depot1.setName(tempString);
                            return;
                        case 2:
                            System.out.print("Depot Name: ");
                            tempString = console.nextLine();
                            depot2.setName(tempString);
                            return;
                    }
                case 2:
                    System.out.print("Remove Depot [1] / [2]: ");
                    System.out.print("\nPlease Make a Selection: ");
                    selector = Integer.parseInt(console.nextLine());

                    switch (selector) {
                        case 1:
                            depot1.setName(null);
                            System.out.println("Depot 1 Deleted...");
                            return;
                        case 2:
                            depot2.setName(null);
                            System.out.println("Depot 2 Deleted...");
                            return;
                    }
            }
        }
    }
    private void productManagement(){
        int selector;

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
                System.out.print("Product Price: ");
                tempFloat = Float.parseFloat(console.nextLine());
                product1.setPrice(tempFloat);
                System.out.print("Product Weight: ");
                tempFloat = Float.parseFloat(console.nextLine());
                product1.setWeight(tempFloat);
                System.out.print("Product Quantity: ");
                tempInt = Integer.parseInt(console.nextLine());
                product1.setQuantity(tempInt);
                System.out.print("");

                product1.setDepot();
            }
            else if (selector == 2) {
                //product2.setName();
                product2.setPrice();
                product2.setWeight();
                product2.setQuantity();
                product2.setDepot();
            }
            else if (selector == 3) {
                //product3.setName();
                product3.setPrice();
                product3.setWeight();
                product3.setQuantity();
                product3.setDepot();
            }
            else {
                System.out.printf("Invalid Selection %d", selector);
            }
        }
        else if (selector == 2) {
            // ADD PRODUCT TO DEPOT 2
        }
    }
    private void run() {
        int selector;

        System.out.println("[1]. Depot Management\n[2]. Product Management");
        System.out.print("Please Make a Selection: ");
        selector = Integer.parseInt(console.nextLine());

        switch (selector) {
            case 1: depotManagement();
            case 2: productManagement();
        }
    }
    public static void main(String[] args) {
        Interface intFace = new Interface();
        intFace.run();
    }
}

