import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        char p = (char)a;
        char q = (char)b;
        char r = (char)c;
        char s = (char)d;
        System.out.println();
        System.out.print(a);
        System.out.println("-"+p);
        System.out.print(b);
        System.out.println("-"+q);
        System.out.print(c);
        System.out.println("-"+r);
        System.out.print(d);
        System.out.println("-"+s);
    }
}
