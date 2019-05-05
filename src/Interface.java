// C3304875
// Matthew Maiden
// Assignment Schema Link: https://uonline.newcastle.edu.au/bbcswebdav/pid-4033358-dt-content-rid-20497413_1/courses/CRS.126440.2019.S1/SENG1110_6110_Assign1-2019-s1%281%29.pdf

import java.util.*;

public class Interface {
    Scanner console = new Scanner(System.in);

    private Depot depot1 = new Depot();
    private Depot depot2 = new Depot();
    private String tempString;
    private int tempInt;
    private int selector;
    private double tempDouble;

    private void depotManagement() {
        Scanner console = new Scanner(System.in);
        tempString = "";
        tempInt = 0;
        tempDouble = 0.0;

        while (true) {
            int selector;

            System.out.println("\n[1]. Add Depot\n[2]. Remove Depot");
            System.out.print("\nPlease Make a Selection: ");
            selector = Integer.parseInt(console.nextLine());

            switch (selector) {
                case 1:
                    System.out.print("\nDepot Slot [1] / [2]: ");
                    selector = Integer.parseInt(console.nextLine());

                    switch (selector) {
                        case 1:
                            System.out.print("\nDepot Name: \n");
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

    private void productManagement() {
        /* Constructors */
        selector = 0;
        tempString = "";
        tempInt = 0;
        tempDouble = 0.0;

        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        System.out.println("[1]. Add Product\n[2]. Remove Product");
        System.out.print("Please Make a Selection: ");
        selector = Integer.parseInt(console.nextLine());
        if (selector == 1) {
            System.out.print("Depot Slot [1], [2]: ");
            if (selector == 1) {
                depot1.addProduct();
            }
        }
        else if (selector == 2) {
            // Dp spmetjoing
        }
        else {
            System.out.printf("Invalid Selection %d", selector);
        }
    }

    private void query() {
        System.out.println("[1]. Depot Query\n[2]. Product Query");
        selector = Integer.parseInt(console.nextLine());

        if (selector == 1) {
            System.out.print("Depot 1");
            depot1.getInfo();
            System.out.print("Depot 2");
            depot2.getInfo();
        } else if (selector == 2) {

        }
    }

    private void run() {
        int selector;

        while (true) {
            System.out.println("\n[1]. Depot Management\n[2]. Product Management\n");
            System.out.print("Please Make a Selection: ");
            selector = Integer.parseInt(console.nextLine());

            switch (selector) {
                case 1:
                    depotManagement();
                    break;
                case 2:
                    productManagement();
                    break;
                case 3:
                    query();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Interface intFace = new Interface();
        intFace.run();
    }
}

