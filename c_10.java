import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car no:");
        int n = sc.nextInt();
        int sum=0;
        int rem = 0;
        int temp = n;
        if(n<1000 || n>9999){
            System.out.println(n+" is a Invalid Input");
        }
        else{
            while(temp>0){
                rem = temp%10;
                sum+=rem;
                temp/=10;
            }
            if(sum%3==0 || sum%5==0 || sum%7==0){
                System.out.println("Lucky number");
            }
            else{
             System.out.println("not a lucky number");
            }
        }
    }
}
