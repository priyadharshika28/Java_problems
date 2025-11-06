import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int zero = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                System.out.print(arr[i]+" ");
            }
            else {
                zero++;
            }
        }
        for(int i=0;i<zero;i++){
            System.out.print("0 ");
        }
    }
}
