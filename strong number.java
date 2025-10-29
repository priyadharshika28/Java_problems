import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem=0,sum=0;
        int temp = n;
        while(n>0){
           rem = n%10;
           sum+=factorial(rem);
           n/=10;
        }
        if(sum==temp){
            System.out.println("strong num");
        }
        else{
            System.out.println("not a strong num");
        }
    }
    public static int factorial(int rem){
        if(rem==0){
            return 1;
        }
        else
            return rem*factorial(rem-1);
    }
}
