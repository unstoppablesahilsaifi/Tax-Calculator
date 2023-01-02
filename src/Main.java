import com.calculation.*;
import java.lang.String.*;
import java.util.Scanner;

import com.finalOutput.Final;
import com.finalOutput.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        String name;
        double price;
        double quantity;
        String type;
        name=args[0];
        price=Double.parseDouble(args[1]);
        quantity=Double.parseDouble(args[2]);
        type=args[3];
        Final f=new Final();
        System.out.println(f.output(name,price,quantity,type));

        char ch;
        do{
            System.out.println("Do you want to enter more item- Yes or No");
            Scanner sc = new Scanner(System.in);
            ch = sc.next().charAt(0);
            if (ch == 'Y' || ch == 'y') {
                Scanner chn = new Scanner(System.in);
                String chname = chn.nextLine();
                Scanner chp = new Scanner(System.in);
                double chprice = chp.nextDouble();
                //  try{
                //      chprice = chp.nextDouble();
                //}catch(InputMismatchException e){
                //      System.out.println(e);
                //      System.out.println("plz enter only  integer");
                //  }
                Scanner chq = new Scanner(System.in);
                double chquantity = chq.nextDouble();
                Scanner cht = new Scanner(System.in);
                String chtype = cht.nextLine();
                System.out.println(f.output(chname, chprice, chquantity, chtype));
            } else {
                System.out.println("*** Thank you so much ***");
            }
        }while(ch=='y' || ch=='Y');



    }
}
