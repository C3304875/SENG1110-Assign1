// C3304875
// Matthew Maiden
// Assignment Schema Link: https://uonline.newcastle.edu.au/bbcswebdav/pid-4033358-dt-content-rid-20497413_1/courses/CRS.126440.2019.S1/SENG1110_6110_Assign1-2019-s1%281%29.pdf

import java.util.*;

public class Interface {
    Scanner console = new Scanner(System.in);
    private int selector;
    private String temp;

    private Depot depot1, depot2;

    private void depotManagement(){
        Scanner console = new Scanner(System.in);
        Depot depot1 = new Depot();
        Depot depot2 = new Depot();

        while (true) {
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
                            temp = console.nextLine();
                            depot1.setName(temp);
                            break;
                        case 2:
                            System.out.print("Depot Name: ");
                            temp = console.nextLine();
                            depot2.setName(temp);
                            break;
                    }
                case 2:
                    System.out.print("Remove Depot [1] / [2]: ");
                    System.out.print("\nPlease Make a Selection: ");
                    selector = Integer.parseInt(console.nextLine());

                    switch (selector) {
                        case 1:
                            depot1.setName(null);
                            break;
                        case 2:
                            depot2.setName(null);
                            break;
                    }
            }
        }
    }

    private void productManagement(){
        System.out.println("[1]. Add Product\n[2]. Remove Product");
        System.out.print("Please Make a Selection: ");
        selector = Integer.parseInt(console.nextLine());

        switch (selector) {
            case 1:
                System.out.print("Product Name: ");
                temp = console.nextLine();

        }
    }

    private void run() {
        System.out.println("[1]. Depot Management");
        System.out.print("Please Make a Selection: ");
        selector = Integer.parseInt(console.nextLine());

        switch (selector) {
            case 1: depotManagement();
        }
    }

    public static void main(String[] args) {
        Interface intFace = new Interface();
        intFace.run();
    }

}

