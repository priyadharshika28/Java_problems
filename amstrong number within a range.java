import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for(int i=low;i<=high;i++){
            int count = 0;
            int temp = i;
            int n = i;
            while(temp>0){
                temp/=10;
                count++;
            }
            int rem = 0;
            temp = i;
            int sum =0;
            while(n!=0){
                rem = n%10;
                sum+=Math.pow(rem,count);
                n/=10;
            }
            if(sum==temp){
                System.out.println(i);
            }
        }
    }
}
