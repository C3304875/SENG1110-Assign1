// C3304875
// Matthew Maiden
// SENG1110

// This program makes use of TIO to enable a user
// to keep track of a small shopping centre inventory.

import java.util.Scanner;

public class Depot {
    Scanner console = new Scanner(System.in);

    private String depotName;
    private String tempString;
    private double tempDouble;
    private int tempInt;
    private int productCount;
    private int selector;
    private Product product1;
    private Product product2;
    private Product product3;

    public Depot() { /* Constructor */
        product1 = new Product();
        product2 = new Product();
        product3 = new Product();

        depotName = "";
        tempString = "";
        tempDouble = 0;
        tempInt = 0;
        productCount = 0;
        selector = 0;
    }

    public void setName(String name) {
        if (depotName == "")
            depotName = name;
        else {
            System.out.println("\nError: Depot Already Exists\n");
            System.out.println("Press Enter to Return...");
            console.nextLine();
            return;
        }
    }
    public void getDepotInfo() {
        if (depotName != "") {
            System.out.printf(" Name: %s\n", depotName);
            System.out.printf("Products: %d\n", productCount);
        } else
            System.out.print(" Error: Depot Does not Exist\n");
    }
    public void getProductInfo() {
        if (productCount == 0) {
            System.out.printf("\nDepot Empty");
            return;
        }
        System.out.println("\nPRODUCT 1:");
        product1.getInfo();
        System.out.println("\n\nPRODUCT 2:");
        product2.getInfo();
        System.out.println("\n\nPRODUCT 3:");
        product3.getInfo();

    }
    public void addProduct(int choice) {
        if (choice == 1) {
            if (depotName == ""){
                System.out.print("\nError: Depot Does Not Exist\n\n");
                System.out.println("Press Enter to Return...");
                console.nextLine();
                return;
            }
            if (productCount == 3) {
                System.out.print("Error: Depot Full");
                System.out.println("Press Enter to Return...");
                console.nextLine();
            }
            System.out.print("\nProduct Name: ");
            tempString = console.nextLine();
            product1.setName(tempString.toLowerCase());
            System.out.print("Product Price: $");
            tempDouble = Double.parseDouble(console.nextLine());
            product1.setPrice(tempDouble);
            System.out.print("Product Weight (kg): ");
            tempDouble = Double.parseDouble(console.nextLine());
            product1.setWeight(tempDouble);
            System.out.print("Product Quantity: ");
            tempInt = Integer.parseInt(console.nextLine());
            product1.setQuantity(tempInt);

            productCount++;
        } if (choice == 2) {
            if (depotName == ""){
                System.out.print("\nError: Depot Does Not Exist\n\n");
                System.out.println("Press Enter to Return...");
                console.nextLine();
                return;
            }
            if (productCount == 3) {
                System.out.print("Error: Depot Full");
                System.out.println("Press Enter to Return...");
                console.nextLine();
            }
            System.out.print("\nProduct Name: ");
            tempString = console.nextLine();
            product2.setName(tempString.toLowerCase());
            System.out.print("Product Price: $");
            tempDouble = Double.parseDouble(console.nextLine());
            product2.setPrice(tempDouble);
            System.out.print("Product Weight (kg): ");
            tempDouble = Double.parseDouble(console.nextLine());
            product2.setWeight(tempDouble);
            System.out.print("Product Quantity: ");
            tempInt = Integer.parseInt(console.nextLine());
            product2.setQuantity(tempInt);

            productCount++;
        }
        if (choice == 3){
            if (depotName == ""){
                System.out.print("\nError: Depot Does Not Exist\n\n");
                System.out.println("Press Enter to Return...");
                console.nextLine();
                return;
            }
            if (productCount == 3) {
                System.out.print("Error: Depot Full");
                System.out.println("Press Enter to Return...");
                console.nextLine();
            }
            System.out.print("\nProduct Name: ");
            tempString = console.nextLine();
            product3.setName(tempString.toLowerCase());
            System.out.print("Product Price: $");
            tempDouble = Double.parseDouble(console.nextLine());
            product3.setPrice(tempDouble);
            System.out.print("Product Weight (kg): ");
            tempDouble = Double.parseDouble(console.nextLine());
            product3.setWeight(tempDouble);
            System.out.print("Product Quantity: ");
            tempInt = Integer.parseInt(console.nextLine());
            product3.setQuantity(tempInt);

            productCount++;
        } else {
            System.out.printf("Invalid Selection %d", selector);
        }
    }
    public void removeProduct(int choice) {
        if (depotName == ""){
            System.out.print("\nError: Depot Does Not Exist\n\n");
            System.out.println("Press Enter to Return...");
            console.nextLine();
            return;
        }
        else if (choice == 1) {
            System.out.printf("\n%s Has Been Removed from %s\n", product1.getName(), depotName);
            System.out.printf("\nPress Enter to Return...");
            console.nextLine();

            product1.setName("");
            product1.setPrice(0);
            product1.setWeight(0);
            product1.setQuantity(0);

            productCount--;
        }
        else if (choice == 2) {
            System.out.printf("\n%s Has Been Removed from %s\n", product2.getName(), depotName);
            System.out.printf("\nPress Enter to Return...");
            console.nextLine();

            product2.setName("");
            product2.setPrice(0);
            product2.setWeight(0);
            product2.setQuantity(0);

            productCount--;
        }
        else if (choice == 3) {
            System.out.printf("%s Has Been Removed from %s", product3.getName(), depotName);
            System.out.printf("Press Enter to Return...");
            console.nextLine();

            product3.setName("");
            product3.setPrice(0);
            product3.setWeight(0);
            product3.setQuantity(0);

            productCount--;
        }
    }
    public void deleteDepot() {
        depotName = "";
        productCount = 0;
    }
    public int checkDepot() { // Check if depot exits
        if (depotName == "")
            return 0;
        else
            return 1;
    }
    public String getName() {
        return depotName;
    }
    public int getProdCount() {
        return productCount;
    }
    public int searchProduct(String searchPhrase) {
        if (searchPhrase.equals(product1.getName())){ // Compare strings, used for searching
            System.out.printf("\n'%s' Exists in Depot '%s' with Quantity %d", searchPhrase, depotName, product1.getQuantity());
            return 0;
        }
        else if (searchPhrase.equals(product2.getName())) {
            System.out.printf("\n'%s' Exists in Depot '%s' with Quantity %d", searchPhrase, depotName, product2.getQuantity());
            return 0;
        }
        else if (searchPhrase.equals(product3.getName())) {
            System.out.printf("\n'%s' Exists in Depot '%s' with Quantity %d", searchPhrase, depotName, product3.getQuantity());
            return 0;
        }
        else
            return 1; // Return 0 if a result was found, return 1 if not

    }
    public double getValue (){ // Calculate value of products
        tempDouble = (product1.getPrice() * product1.getQuantity()) + (product2.getPrice() * product2.getQuantity()) + (product3.getPrice() * product3.getQuantity());
        return tempDouble;
    }
}