import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        while(sc.hasNext()){
            int v = sc.nextInt();
            l.add(v);
        }
        int zero = 0;
        for(int i : l){
            if(i!=0){
                System.out.print(i+" ");
            }
            else{
                zero++;
            }
        }
        for(int i=0;i<zero;i++){
            System.out.print("0 ");
        }
	}
}
