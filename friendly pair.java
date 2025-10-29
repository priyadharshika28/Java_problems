import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum1 = getdivisorsum(n1);
        int sum2 = getdivisorsum(n2);
        if(sum1/n1==sum2/n2){
            System.out.println("friendly pair");
        }
        else{
            System.out.println("not a friendly pair");
        }
    }
    public static int getdivisorsum(int num){
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i==0)
            sum+=i;
        }
        return sum;
    }
}
