import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rem = 0;
        int rev =0;
        if(temp>=0){
            while(temp>0){
            rem = temp%10;
            rev = rev*10+rem;
            temp/=10;
            }
            if(n==rev){
             System.out.println("palindrome");
            }
            else{
            System.out.println("not palindrome");
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
