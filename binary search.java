import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        int left = 0;
        int right = arr.length-1;
        int index = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==k){
                index = mid;
                break;
            }
            else if(arr[mid]<k){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        if(index!=-1){
            System.out.println("element foun at "+index);
        }
        else{
            System.out.println("not found");
        }
    }
}
