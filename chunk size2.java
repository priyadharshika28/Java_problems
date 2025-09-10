import java.util.*;
class Main{
    public static void chunks(int[] arr,int k){
        int n = arr.length;
        while(n%k!=0){
            n--;
        }
        for(int i=0;i<n;i+=k){
            System.out.print("[");
            for(int j=0;j<k;j++){
                System.out.print(arr[i+j]);
                if(j<k-1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        chunks(arr,k);
    }
}
