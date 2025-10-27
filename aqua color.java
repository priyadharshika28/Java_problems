import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = sc.nextInt();
        int c=0;
        int m=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                c++;
            }
            if((i+1)%l==0){
                m=Math.max(m,c);
                c=0;
            }
        }
        m=Math.max(m,c);
        System.out.print(m);
	}
}
