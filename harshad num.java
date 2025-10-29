import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println(sum);
        if(n%sum==0){
            System.out.println("harshad num");
        }
        else{
            System.out.println("not harshad num");
        }
    }
}
