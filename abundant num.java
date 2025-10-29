import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        if(sum>n){
            System.out.println("abundant num");
        }
        else{
            System.out.println("not abundant num");
        }
    }
}
