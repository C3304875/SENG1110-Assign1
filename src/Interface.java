// C3304875
// Matthew Maiden
// Assignment Schema Link: https://uonline.newcastle.edu.au/bbcswebdav/pid-4033358-dt-content-rid-20497413_1/courses/CRS.126440.2019.S1/SENG1110_6110_Assign1-2019-s1%281%29.pdf

import java.util.*;

public class Interface
{
    Scanner console = new Scanner(System.in);

    private String temp;
    private Depot depot1, depot2;

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
                            temp = console.nextLine();
                            depot1.setName(temp);
                            return;
                        case 2:
                            System.out.print("Depot Name: ");
                            temp = console.nextLine();
                            depot2.setName(temp);
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

        switch (selector) {
            case 1:
                System.out.print("Depot [1] / [2]\n");
                System.out.print("Please Make a Selection: ");
                selector = Integer.parseInt(console.nextLine());

                switch (selector) {
                    case 1: depot1.addProduct();
                    case 2: depot2.addProduct();
                }



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

