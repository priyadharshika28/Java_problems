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
        int g,p;
        for(g=p=0;p<l.size();p++){
            if(l.get(p)!=0){
                int temp = l.get(p);
                l.set(p,l.get(g));
                l.set(g,temp);
                g++;
            }
        }
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
	}
}
