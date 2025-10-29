import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int noofint = sc.nextInt();
        int noofext = sc.nextInt();
        double cost = 0;
        for(int i=0;i<noofint;i++){
            double surface = sc.nextDouble();
            cost+=surface*18;
        }
        for(int i=0;i<noofext;i++){
            double surface = sc.nextDouble();
            cost+=surface*12;
        }
        System.out.println(cost);
	}
}
