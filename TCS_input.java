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
        for(int i:l){
            System.out.print(i+" ");
        }
	}
}
