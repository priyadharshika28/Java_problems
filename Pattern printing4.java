import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=i;j>0;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}  
/* output:
5
55555
4444
333
22
1
*/
