import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int i=1;
        while(i<=n){
            count++;
            i+=arr[i-1];
        }
        System.out.println(count);
    }
}
