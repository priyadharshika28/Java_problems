import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = Math.abs(n);
        if(num==0){
            System.out.println("No factor");
        }
        StringBuilder factor = new StringBuilder();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                factor.append(i).append(", ");
            }
        }
        if(factor.length()>0){
            factor.setLength(factor.length()-2);
        }
        System.out.println(factor.toString());
    }
}
