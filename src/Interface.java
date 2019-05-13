// C3304875
// Matthew Maiden
// SENG1110

// This program makes use of TIO to enable a user
// to keep track of a small shopping centre inventory.

import java.util.Scanner;

public class Interface {
	Scanner console = new Scanner(System.in);

	private Depot depot1;
	private Depot depot2;
	private String tempString;
	private int tempInt;
	private int selector;
	private double tempDouble;

	public Interface() { /* Constructor */
		depot1 = new Depot();
		depot2 = new Depot();
		tempString = "";
		tempInt = 0;
		selector = 0;
		tempDouble = 0.0;
	}

	private void depotManagement() {
		Scanner console = new Scanner(System.in);

		while (true) { // Loop until a valid option is chosen
			int selector;

			clearInterface();
			System.out.println("Depot Management\n");
			System.out.println("[1]. Add Depot\n[2]. Remove Depot");
			System.out.print("\nPlease Make a Selection: ");
			selector = Integer.parseInt(console.nextLine()); // Don't record '\n'

			if (selector == 1) {
				clearInterface(); // Clear the console
				System.out.println("Depot Management --> Add Depot");
				if (depot1.checkDepot() == 1 && depot2.checkDepot() == 1) { // checkDepot returs 1 if depot exists
					System.out.println("\nError: No Empty Depot Slots");
					System.out.print("\nPress Enter to Return...");
					console.nextLine(); // Record 'Enter' keystroke
					return;
				}
				System.out.print("\nDepot Slot [1] or [2]: ");
				selector = Integer.parseInt(console.nextLine());

				if (selector == 1) {
					clearInterface();
					System.out.println("Depot Management --> Add Depot --> Add Depot 1");
					System.out.print("\nDepot Name: ");
					tempString = console.nextLine();
					depot1.setName(tempString);
					return;
				}
				else if (selector == 2) {
					clearInterface();
					System.out.println("Depot Management --> Add Depot --> Add Depot 2");
					System.out.print("\nDepot Name: ");
					tempString = console.nextLine();
					depot2.setName(tempString);
					return;
				}
				else {
					System.out.println("Error: Invalid Selection");
				}
			}
			else if (selector == 2) {
				clearInterface();
				System.out.println("Depot Management --> Remove Depot\n");
				System.out.print("Remove Depot [1] or [2]: ");
				selector = Integer.parseInt(console.nextLine());

				if (selector == 1) {
					if (depot1.checkDepot() == 0) { // checkDepot returs 1 if depot exists
						clearInterface();
						System.out.println("Depot Management --> Remove Depot --> Depot 1\n");
						System.out.println("Error: Depot Already Empty");
						System.out.print("\nPress Enter to Return...");
						console.nextLine();
						return;
					}
					else {
						depot1.deleteDepot(); // Delete depot if it does exist
						return;
					}
				}
				else if (selector == 2) {
					if (depot2.checkDepot() == 0) {
						clearInterface();
						System.out.println("Depot Management --> Remove Depot --> Depot 2\n");
						System.out.println("Error: Depot Already Empty");
						System.out.print("\nPress Enter to Return...");
						console.nextLine();
						return;
					}
					else {
						depot2.deleteDepot();
						return;
					}
				}
			}
		}
	}
	private void productManagement() {

		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();

		clearInterface(); // Clear console
		System.out.println("Product Management\n");
		System.out.println("[1]. Add Product\n[2]. Remove Product");
		System.out.print("\nPlease Make a Selection: ");
		selector = Integer.parseInt(console.nextLine());

		if (selector == 1) {
			clearInterface();
			System.out.println("Product Management --> Add Product\n");
			System.out.print("Depot Slot [1] or [2]: ");
			selector = Integer.parseInt(console.nextLine());
			if (selector == 1) {
				clearInterface();
				System.out.println("Product Management --> Add Product --> Depot 1\n");
				if (depot1.getProdCount() == 3) { // Check if depot is full
					System.out.println("Error: Depot Full");
					return;
				}
				else { // If depot not full; add product
					System.out.print("Product Slot: [1] or [2] or [3]: ");
					selector = Integer.parseInt(console.nextLine());
					clearInterface();
					System.out.printf("Product Management --> Add Product --> Depot 1 --> Slot %s\n", selector);
					depot1.addProduct(selector); // Add a product to the chosen slot
				}
			}
			else if (selector == 2) {
				clearInterface();
				System.out.println("Product Management --> Add Product --> Depot 2\n");
				if (depot2.getProdCount() == 3) {
					System.out.println("Error: Depot Full");
					return;
				}
				else {
					System.out.print("Product Slot: [1] or [2] or [3]: ");
					selector = Integer.parseInt(console.nextLine());
					clearInterface();
					System.out.printf("Product Management --> Add Product --> Depot 1 --> Slot %s\n", selector);
					depot2.addProduct(selector);
				}
			}
			else {
				System.out.println("Error: Invalid Selection");
			}
		}
		else if (selector == 2) {
			clearInterface();
			System.out.println("Product Management --> Remove Product\n");
			System.out.print("Depot Slot [1] or [2]");
			selector = Integer.parseInt(console.nextLine());
			if (selector == 1) {
				clearInterface();
				System.out.println("Product Management --> Remove Product --> Depot 1\n");
				System.out.print("Product Slot: [1] or [2] or [3]: ");
				selector = Integer.parseInt(console.nextLine());
				clearInterface();
				System.out.printf("Product Management --> Remove Product --> Depot 1 --> Slot %s\n", selector);
				depot1.removeProduct(selector);
			}
			else if (selector == 2) {
				clearInterface();
				System.out.println("Product Management --> Remove Product --> Depot 2\n");
				System.out.print("Product Slot: [1] or [2] or [3]: ");
				selector = Integer.parseInt(console.nextLine());
				clearInterface();
				System.out.printf("Product Management --> Remove Product --> Depot 2 --> Slot %s\n", selector);
				depot2.removeProduct(selector);
			}
		}
		else {
			System.out.printf("Invalid Selection %d", selector);
		}
	}
	private void query() {
		clearInterface();
		System.out.println("Query\n");
		System.out.println("[1]. Depot Query\n[2]. Product Query\n[3]. Search\n[4]. Value Query");
		System.out.print("\nPlease Make a Selection: ");
		selector = Integer.parseInt(console.nextLine());

		if (selector == 1) {
			clearInterface();
			System.out.println("Query --> Depot Query");
			System.out.print("\nDepot 1");
			depot1.getDepotInfo();
			System.out.print("\nDepot 2");
			depot2.getDepotInfo();
			System.out.print("\nPress Enter to Return...");
			console.nextLine();
		}
		else if (selector == 2) {
			clearInterface();
			System.out.println("Query --> Product Query");
			System.out.print("\nQuery Products for Depot [1] or [2]: ");
			selector = Integer.parseInt(console.nextLine());
			if (selector == 1) {
				clearInterface();
				System.out.print("Query --> Product Query --> ");
				depot1.getName(); // Get requested info from depot
				depot1.getProductInfo();
				System.out.print("\n\nPress Enter to Return...");
				console.nextLine();
			}
			else if (selector == 2) {
				clearInterface();
				System.out.print("Query --> Product Query --> ");
				depot2.getName(); // Get requested info from depot
				depot2.getProductInfo();
				System.out.print("\n\nPress Enter to Return...");
				console.nextLine();
			}
		}
		else if (selector == 3) {
			clearInterface();
			System.out.println("Query --> Search Query\n");
			System.out.println("Search For: ");
			tempString = console.nextLine(); // Record search phrase
			depot1.searchProduct(tempString); // Call function with phrase as parameter
			if (depot1.searchProduct(tempString) == 1) // If a result couldnt be found in Depot 1, try depot 2
				depot2.searchProduct(tempString);
			System.out.print("\n\nPress Enter to Return...");
			console.nextLine();
		}
		else if (selector == 4) {
			clearInterface();
			System.out.println("Query --> Value Query\n");
			System.out.print("Value for Depot [1] or [2]: ");
			selector = Integer.parseInt(console.nextLine());
			if (selector == 1) {
				if (depot1.getName() == ""){ // Check if depot exists
					clearInterface();
					System.out.print("Error: Depot Does Not Exist.");
				}
				else {
					System.out.printf("\nThe Value of Depot '%s' is $%f", depot1.getName(), depot1.getValue());
				}
			}
			else if (selector == 2) {
				if (depot2.getName() == ""){ // Check if depot exists ]
					clearInterface();
					System.out.print("Error: Depot Does Not Exist.");
				}
				else
					System.out.printf("\nThe Value of Depot '%s' is $%f", depot2.getName(), depot2.getValue());
			}
			System.out.print("\n\nPress Enter to Return...");
			console.nextLine();
		}
	}
	private void run() {
		int selector;

		while (true) {
			clearInterface();
			System.out.println("Main Menu\n");
			System.out.println("[1]. Depot Management\n[2]. Product Management\n[3]. Query\n[4]. Exit\n");
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
				case 4:
					return;
			}
		}
	}
	private void clearInterface() {
		System.out.print("\033[H\033[2J"); // Clears console
	}

	public static void main(String[] args) {
		Interface intFace = new Interface();
		intFace.run();
	}
}

