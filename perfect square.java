import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqrt = (int)Math.sqrt(n);
        if(sqrt*sqrt == n){
            System.out.println("perfect square");
        }
        else{
            System.out.println("not a perfect square");
        }
    }
}
