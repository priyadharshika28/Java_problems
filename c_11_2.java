import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of course:");
        int n = sc.nextInt();
        if(n<0 || n>20){
            System.out.println("Invalid range");
            return;
        }
        sc.nextLine();
        String course[] = new String[n];
        System.out.println("Enter course name:");
        for(int i=0;i<n;i++){
            course[i] = sc.nextLine();
        }
        System.out.println("Enter course to be searched:");
        String search = sc.nextLine();
        int flag=0;
        for(int i=0;i<course.length;i++){
            if(course[i].equals(search)){
                flag = 1;
            }
        }
        if(flag==1){
            System.out.println(search+" course is available");
        }
        else{
            System.out.println(search+" course is not available");
        }
    }
}
