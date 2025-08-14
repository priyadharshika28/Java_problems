import java.util.*;
import java.text.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");
        int litres = sc.nextInt();
        double litre = litres*1.00;
        if(litres<1){
            System.out.println(litres+" is an Invalid Input");
            return;
        }
        int distances = sc.nextInt();
        double distance = distances*1.00;
        if(distances<1){
            System.out.println(distances+" is an Invalid Input");
            return;
        }
        double hundred = litre/distance*100;
        System.out.println("Litres/100KM");
        System.out.println(df2.format(hundred));
        double miles = distance*0.6214;
        double gallons = litre*0.2642;
        double mg = miles/gallons;
        System.out.println("Miles/gallons");
        System.out.println(df2.format(mg));
    }
}
