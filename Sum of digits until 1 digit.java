import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0,rem;
        while(num>=10){
            sum=0;
            while(num>0){
                rem = num%10;
                sum+=rem;
                num/=10;
            }
            num=sum;
        }
        System.out.println(num);
    }
}
