import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = Math.abs(n);
        if(num==0){
            System.out.println("No factor");
        }
        else{
            for(int i=1;i<num;i++){
                if(num%i==0){
                    System.out.print(i+", ");
                }
            }
            System.out.println(num);
        }
    }
}
