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
		    int c = 21-a-b;
		    if(c<=10){
		        System.out.println(c);
		    }
		    else{
		        System.out.println("-1");
		    }
		}
	}
}
