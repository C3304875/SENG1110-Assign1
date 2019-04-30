// C3304875
// Matthew Maiden
// Assignment Schema Link: https://uonline.newcastle.edu.au/bbcswebdav/pid-4033358-dt-content-rid-20497413_1/courses/CRS.126440.2019.S1/SENG1110_6110_Assign1-2019-s1%281%29.pdf

import java.util.*;

public class Interface {
    static Scanner console = new Scanner(System.in);

    int option = 0;

    while (1) {
        System.out.println("Please Select 1, 2, 3, 4 or 5\n");
        System.out.println("|| 1. Add Depot || 2. Remove Depot || 3. Add Product to Depot || 4. Remove Product from Depot || 5. Exit System ||");
        System.out.print("Selection: ");
        option = console.nextInt();
        switch (option) {
            case 1: System.out.println("Add Depot\n");
                    break;
            case 2: System.out.println("Remove Depot\n");
                    break;
            case 3: System.out.println("Add Product to Depot\n");
                    break;
            case 4: System.out.println("Remove Product from Depot\n");
                    break;
            case 5: break;
            default: System.out.println("Invaid Selection: \n"+ option);
        }
    }
}


