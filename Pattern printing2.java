import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=n;j>0;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/* output:
5
55555
44444
33333
22222
11111 
*/
