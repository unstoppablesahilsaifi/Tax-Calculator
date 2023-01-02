package com.calculation;

public class Imported {
    public double takePrice4Imported(double p)
    {
        double importtax;
        importtax=0.1 *p;
        if(importtax<=100)
            importtax+=5;
        else if(importtax>=100 && importtax<=200)
            importtax+=10;
        else
            importtax+=0.05 * (importtax + p);
        return importtax;

    }
}
