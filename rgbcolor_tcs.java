import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] colors = new char[n];
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = sc.next().charAt(0);
            if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
            }
            colors[i] = ch;
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<n;i++){
            if(mp.get(colors[i])%2!=0){
                System.out.println(colors[i]);
                return;
            }
        }
        System.out.println("all are even");
	}
}
