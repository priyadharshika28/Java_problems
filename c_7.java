import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1<=0 || n2<=0 || n1>=n2){
            System.out.println("Provide valid input");
        }
        for(int num=n1;num<=n2;num++){
            if(num<2){
                continue;
            }
            boolean isprime = true;
            int i = 2;
            while(i<=Math.sqrt(num)){
                if(num%i==0){
                    isprime = false;
                    break;
                }
                i++;
            }
            if(isprime){
                System.out.print(num+" ");
            }
        }
    }
}
