// C3304875
// Matthew Maiden
// Assignment Schema Link: https://uonline.newcastle.edu.au/bbcswebdav/pid-4033358-dt-content-rid-20497413_1/courses/CRS.126440.2019.S1/SENG1110_6110_Assign1-2019-s1%281%29.pdf

import java.util.*;

public class Interface
{
    public void run(){
        //this method should control the flow of the program
    }
    public static void main(String[] args) {
        Interface intFace = new Interface();
        Scanner console = new Scanner(System.in);
        intFace.run();

        int selector = 0;

        Depot depot1 = new Depot();
        Depot depot2 = new Depot();

        while (selector != 5) {
            System.out.println("\n1. Depot Management\n2. Product Management\n3. Query");
            selector = console.nextInt();
            switch (selector) {
                case 1:
                    System.out.println("\n1. Add Depot\n2. Remove Depot");
                    selector = console.nextInt();
                    if (selector == 1) {
                        System.out.println("1. Depot 1\n2. Depot 2");
                        selector = console.nextInt();
                        if (selector == 1)
                            depot1.setName();
                        else if (selector == 2)
                            depot2.setName();
                    }
                    break;
                case 2:
                    System.out.println("1. Add Product\n2. Remove Product");
                    selector = console.nextInt();
                case 3:
                    System.out.println("1. Depot Query\n2. Product Query");
                    selector = console.nextInt();
                    if (selector == 1) {
                        System.out.println("1. Depot 1\n2. Depot 2");
                        selector = console.nextInt();
                        if (selector == 1)
                            System.out.println("Name: " + depot1.getName());
                        else if (selector == 2)
                            System.out.println("Name: " + depot2.getName());
                    }
                    break;
            }
        }
    }
}

