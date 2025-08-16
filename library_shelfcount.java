import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int tot = lib(n, k,  arr);
        System.out.println(tot);
    }
    public static boolean isprime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int lib(int n,int k, int[] arr){
        int tot = 0;
        for(int i=1;i<=n;i++){
            if(isprime(i)){
                tot+=Math.min(k,arr[i-1]);
            }
        }
        return tot;
    }
}
