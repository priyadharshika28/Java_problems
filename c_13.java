import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of semester");
        int sem = sc.nextInt();
        int[] arr = new int[sem];
        int[] maxmarks = new int[sem];
        for(int i=0;i<sem;i++){
            System.out.println("Enter no of subject in "+(i+1)+" semester");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<sem;i++){
            System.out.println("marks obtained in "+(i+1)+" semester");
            int max = 0;
            for(int j=0;j<arr[i];j++){
                int marks = sc.nextInt();
                if(marks<0 || marks>100){
                    System.out.println("you have entered invalid input");
                    return;
                }
                if(marks>max){
                    max = marks;
                }
            }
            maxmarks[i] = max;
        }
        for(int i=0;i<sem;i++){
            System.out.println(" maximum marks in "+(i+1)+" semester:"+maxmarks[i]);
        }
    }
}
