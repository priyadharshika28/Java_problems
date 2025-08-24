import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i=0;i<m;i++){
            arr[i] = sc.nextInt();
        }
        int temp[] = zerotorightnum(arr);
        for(int x:temp){
            System.out.print(x+" ");
        }
    }
    public static int[] zerotorightnum(int[] arr){
        int n = arr.length;
        int next = -1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=0){
                next = arr[i];
            }
            else if(next!=-1){
                arr[i] = next;
            }
        }
        return arr;
    }
}
