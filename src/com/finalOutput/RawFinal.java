package com.finalOutput;

import com.calculation.Raw;

public class RawFinal {
    public int output4raw(double price, double quantity) {
        Raw r=new Raw();
        System.out.println("Tax of this item" + r.takePrice4Raw( price));
        double f = price + r.takePrice4Raw(price);
        System.out.println("Final price of this item = " + f);
        double totalpay = f * quantity;
        System.out.println("Total amount to pay = " + totalpay);
        return 0;
    }
}
