import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int d = sc.nextInt();
	        if((a+c==180)&&(b+d==180)){
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	        }
	    }
	}
}
