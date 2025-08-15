import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] names = new String[n];
        int[] discount = new int[n];
        for(int i=0;i<n;i++){
            String line = sc.nextLine();
            String[] parts = line.split(",");
            String name = parts[0];
            int price = Integer.parseInt(parts[1]);
            int percent = Integer.parseInt(parts[2]);
            int discountamt = price*percent/100;
            names[i] = name;
            discount[i] = discountamt;
        }
        int mindiscount = discount[0];
        for(int i=1;i<n;i++){
            if(discount[i]<mindiscount){
                mindiscount = discount[i];
            }
        }
        for(int i=0;i<n;i++){
            if(discount[i]==mindiscount){
                System.out.println(names[i]);
            }
        }
    }
}
