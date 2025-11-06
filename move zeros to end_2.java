import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int i=0;
        int z=0;
        for(i=0;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[z];
                arr[z] = arr[i];
                arr[i] = temp;
                z++;
            }
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
