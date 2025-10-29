import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n*n;
        if(isautomorphic(n)==1){
            System.out.println("automorphic");
        }
        else{
            System.out.println("not automorphic");
        }
    }
    public static int isautomorphic(int n){
        int sq = n*n;
        while(n>0){
            if(n%10!=sq%10){
                return 0;
            }
            n/=10;
            sq/=10;
        }
        return 1;
    }
}
