import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double litres = sc.nextDouble();
        double distance = sc.nextDouble();
        if(litres<=0){
            System.out.printf("%.0f is an Invalid Input",litres);
            return;
        }
        if(distance<=0){
            System.out.printf("%.0f is an Invalid Input",distance);
            return;
        }
        double european_style = litres/distance*100;
        double miles = distance*0.6214;
        double gallons = litres*0.2642;
        double us_style = miles/gallons;
        System.out.printf("%.2f\n",european_style);
        System.out.printf("%.2f",us_style);
    }
}
