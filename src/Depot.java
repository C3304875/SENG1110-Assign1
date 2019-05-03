// C3304875
// Matthew Maiden
// Assignment Schema Link: https://uonline.newcastle.edu.au/bbcswebdav/pid-4033358-dt-content-rid-20497413_1/courses/CRS.126440.2019.S1/SENG1110_6110_Assign1-2019-s1%281%29.pdf

import java.util.*;

public class Depot
{
    Scanner console = new Scanner(System.in);

    private String depotName;
    private String tempString;
    private float tempFloat;
    private int tempInt;
    private int productCount;
    private Product product1, product2, product3;

    public void setName(String name){
        depotName = name;
    }
    public String getName(){
        return depotName;
    }
    public void addProduct() {
        System.out.print("Product Name: ");
        tempString = console.nextLine();
        product1.setName(tempString.toLowerCase());

        System.out.print("Product Price: ");
        tempFloat = console.nextFloat();
        product1.setPrice(tempFloat);

        System.out.print("Product Weight: ");
        tempFloat = console.nextFloat();
        product1.setWeight(tempFloat);

        System.out.print("Quantity: ");
        tempInt = Integer.parseInt(console.nextLine());
        product1.setQuantity(tempInt);
    }
}
