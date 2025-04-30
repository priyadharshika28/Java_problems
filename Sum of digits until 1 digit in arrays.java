import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            int val = arr[i];
            int sum = 0, rem;
            while (val >= 10) {
                sum = 0;
                while (val > 0) {
                    rem = val % 10;
                    sum += rem;
                    val /= 10;
                }
                val = sum;  
            }
            System.out.print(val + " "); 
        }
        System.out.println();
        sc.close();
    }
}
