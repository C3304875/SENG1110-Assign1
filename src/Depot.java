// C3304875
// Matthew Maiden
// Assignment Schema Link: https://uonline.newcastle.edu.au/bbcswebdav/pid-4033358-dt-content-rid-20497413_1/courses/CRS.126440.2019.S1/SENG1110_6110_Assign1-2019-s1%281%29.pdf

import java.util.*;

public class Depot
{
    Scanner console = new Scanner(System.in);
    private String name;

    public Depot()
    {
        name = "";
    }

    public void setName(){
        System.out.println("Enter name: ");
        String name = console.nextLine();
    }
    public String getName(){
        return name;
    }
    //add other methods
}
