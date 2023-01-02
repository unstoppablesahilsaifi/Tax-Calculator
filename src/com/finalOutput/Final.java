package com.finalOutput;


public class Final {
    public double output(String name, double price, double quantity, String type)
    {
        switch(type)
        {
            case "raw":
                System.out.println("Name of the item = "+name);
                System.out.println("Price of the item = "+price);
                System.out.println("Quantity of the item = "+quantity);
                System.out.println("Type of the item = "+type);
                RawFinal rw=new RawFinal();
                System.out.println(rw.output4raw(price,quantity));
                //System.out.println(r.takePrice4Raw(price));
                break;

            case "manufactured":

                System.out.println("Name of the item = "+name);
                System.out.println("Price of the item = "+price);
                System.out.println("Quantity of the item = "+quantity);
                System.out.println("Type of the item = "+type);
                ManufacturedFinal mf=new ManufacturedFinal();
                System.out.println(mf.output4manufactured(price,quantity));
                //System.out.println(m.takePrice4Manufactured(price));
                break;

            case "imported":

                System.out.println("Name of the item = "+name);
                System.out.println("Price of the item = "+price);
                System.out.println("Quantity of the item = "+quantity);
                System.out.println("Type of the item = "+type);
                ImportedFinal imf=new ImportedFinal();
                System.out.println(imf.output4imported(price,quantity));
                // System.out.println(i.takePrice4Imported(price));
                break;
            default:
                System.out.println("wrong choice");
        }
        return 0;

    }
}
