import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/* output:
5
00000
11111
22222
33333
44444
*/
