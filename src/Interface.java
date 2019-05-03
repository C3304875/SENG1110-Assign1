// C3304875
// Matthew Maiden
// Assignment Schema Link: https://uonline.newcastle.edu.au/bbcswebdav/pid-4033358-dt-content-rid-20497413_1/courses/CRS.126440.2019.S1/SENG1110_6110_Assign1-2019-s1%281%29.pdf

import java.util.*;

public class Interface {

    private Depot depot1, depot2;

    public void run() {
        Scanner console = new Scanner(System.in);
        Depot depot1 = new Depot();
        Depot depot2 = new Depot();

        int selector;

        while (true) {
            System.out.println("[1]. Depot Management\n...\n[3]. Query\n");
            System.out.print("Please Make a Selection: ");
            selector = Integer.parseInt(console.nextLine());
            switch (selector) {
                case 1:
                    System.out.println("[1]. Add Depot\n[2]. Remove Depot");
                    selector = Integer.parseInt(console.nextLine());
                    switch (selector) {
                        case 1:
                            System.out.print("Depot Name: ");
                            String temp = console.nextLine();
                            depot1.setName(temp);
                            break;
                        case 2:
                            System.out.println("Choose Depot: \nDepot [1]\nDepot [2]");
                            selector = Integer.parseInt(console.nextLine());
                            switch (selector) {
                                case 1:
                                    /* REMOVE DEPOT */
                                    depot1.clear();
                                    System.out.println("Depot 1 Removed Successfully.\n");
                                    break;
                                case 2:
                                    /* REMOVE DEPOT */
                                    depot2.clear();
                                    System.out.println("Depot 2 Removed Successfully.\n");
                                    break;
                            }
                    }
                case 2:
                    break;
                case 3:
                    System.out.println("[1]. Depot Qeury");
                    selector = Integer.parseInt(console.nextLine());
                    switch (selector) {
                        case 1:
                            System.out.printf("Depot 1 Name: %s\nDepot 2 Name: %s\n", depot1.getName(), depot2.getName());
                    }
            }
        }
    }

    public static void main(String[] args) {
        Interface intFace = new Interface();
        intFace.run();
    }

}

