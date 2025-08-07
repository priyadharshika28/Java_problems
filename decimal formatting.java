import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float res1 = a/b;
        float res2 = Math.round(a/b*1000)/1000.0f;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(String.format("%.3f",a/b));
        System.out.printf("%.3f", a/b);
    }
}
