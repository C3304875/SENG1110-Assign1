// C3304875
// Matthew Maiden
// Assignment Schema Link: https://uonline.newcastle.edu.au/bbcswebdav/pid-4033358-dt-content-rid-20497413_1/courses/CRS.126440.2019.S1/SENG1110_6110_Assign1-2019-s1%281%29.pdf

import java.util.*;

public class Depot {
    Scanner console = new Scanner(System.in);

    private String depotName;
    private String tempString;
    private float tempFloat;
    private int tempInt;
    private int productCount;
    private Product product1, product2, product3;

    public void setName(String name) {
        depotName = name;
    }
    public String getName() {
        return depotName;
    }
}
