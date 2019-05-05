// C3304875
// Matthew Maiden
// Assignment Schema Link: https://uonline.newcastle.edu.au/bbcswebdav/pid-4033358-dt-content-rid-20497413_1/courses/CRS.126440.2019.S1/SENG1110_6110_Assign1-2019-s1%281%29.pdf

import javax.swing.plaf.synth.SynthStyle;
import java.util.*;

public class Product {
    Scanner console = new Scanner(System.in);

    private String productName;
    private double price;
    private double weight;
    private int quantity;
    private int depot;

    public void setName(String nm){
        productName = nm;
    }
    public void setPrice(double pr) {
        price = pr;
    }
    public void setWeight(double wt) {
        weight = wt;
    }
    public void setQuantity(int qt) {
        quantity = qt;
    }
    public void setDepot(int dp) {
        depot = dp;
    }
}