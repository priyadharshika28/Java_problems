import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of pizza bought:");
        int no_pizza = sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        int no_puffs = sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        int no_drinks = sc.nextInt();
        int pizza = Math.abs(no_pizza*100);
        int puffs = Math.abs(no_puffs*20);
        int drinks = Math.abs(no_drinks*10);
        System.out.println("Bill details");
        System.out.println("no of pizza:"+no_pizza);
        System.out.println("no of puffs:"+no_puffs);
        System.out.println("no of drinks:"+no_drinks);
        int tot = pizza+puffs+drinks;
        System.out.println("tot price="+tot);
        System.out.println("ENJOY THE SHOW");
    }
}
