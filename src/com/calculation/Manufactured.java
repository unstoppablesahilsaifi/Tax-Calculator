package com.calculation;

public class Manufactured {
    public double takePrice4Manufactured(double p)
    {
        double manufacturedtax=(0.125)*p;
        manufacturedtax+=((0.02) * (p+manufacturedtax));
        return manufacturedtax;


    }
}

