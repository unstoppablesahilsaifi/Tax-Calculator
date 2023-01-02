package com.finalOutput;
import com.calculation.*;

public class ImportedFinal {
    public int output4imported(double price,double quantity)
    {
        Imported i=new Imported();
        System.out.println("Tax of this item = " + i.takePrice4Imported((int) price));
        double f = price + i.takePrice4Imported((int) price);
        System.out.println("Final price of this item = " + f);
        double totalpay = f * quantity;
        System.out.println("Total amount to pay = " + totalpay);
        return 0;
    }

}