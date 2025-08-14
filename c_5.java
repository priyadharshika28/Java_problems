import java.util.*;
import java.text.DecimalFormat;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of tickets:");
        int no_ticket = sc.nextInt();
        if(no_ticket< 5 || no_ticket>40){
            System.out.println("Minimum of 5 and maximum of 40 tickets");
            return;
        }
        System.out.println("Do you want refreshment:");
        String ref = sc.next();
        System.out.println("Do you have coupon code:");
        String cc = sc.next();
        System.out.println("Enter the circle:");
        String circle = sc.next();
        double total = 0;
        double cost;
        if(circle.charAt(0)=='k'){
            cost = 75*no_ticket;
        }
        else if(circle.charAt(0)=='q'){
            cost = 150*no_ticket;
        }
        else{
            System.out.println("Invalid Input");
            return;
        }
        total = cost;
        if(no_ticket>20){
            cost = cost-((0.1)*cost);
        }
        total = cost;
        if(cc.charAt(0)=='y'){
            total = cost - ((0.02)*cost);
        }
        if(ref.charAt(0)=='y'){
            total+=(no_ticket*50);
        }
        System.out.format("Ticket cost:%.2f",total);
    }
}
