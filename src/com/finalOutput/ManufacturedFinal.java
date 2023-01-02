package com.finalOutput;

import com.calculation.Manufactured;

public class ManufacturedFinal {
    public int output4manufactured(double price,double quantity)
    {
        Manufactured m=new Manufactured();

        System.out.println("Tax of this item = " + m.takePrice4Manufactured( price));
        double f = price + m.takePrice4Manufactured( price);
        System.out.println("Final price of this item = " + f);
        double totalpay = f * quantity;
        System.out.println("Total amount to pay = " + totalpay);
        return 0;
    }
}