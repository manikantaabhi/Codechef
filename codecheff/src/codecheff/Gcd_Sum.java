package codecheff;
import java.util.*;
import java.util.Scanner;

public class Gcd_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int n=sc.nextInt();
			int val=0;
			ArrayList<Integer> odd=new ArrayList<Integer>();
			ArrayList<Integer> even=new ArrayList<Integer>();
			for(int i=0;i<n;i++)
			{
				val=sc.nextInt();	
				if(odd.contains(val)||even.contains(val))
				{
					
				}
				else
				{
					if(val%2==0)
						even.add(val);
					else
						odd.add(val);
				}
			}
			Collections.sort(odd);
			Collections.sort(even);
			
		}
	}
	static int gcd(int a,int b)
	{
		if (a == 0) 
	        return b; 
	    return gcd(b % a, a);
	}
}
