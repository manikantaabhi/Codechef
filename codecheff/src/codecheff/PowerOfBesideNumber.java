
package codecheff;

import java.util.Scanner;

public class PowerOfBesideNumber {
	public int value(int input1)
	{
		double res=0;
		String str=Integer.toString(input1);
		for(int i=0;i<str.length();i++)
			if(i==str.length()-1)
				res=res+Math.pow(    (int)str.charAt(i),0     );
			else
			{
				res=res+Math.pow(   (int)str.charAt(i)-48  ,  (int)str.charAt(i+1)-48  );
			}
		return (int)res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PowerOfBesideNumber p=new PowerOfBesideNumber();
		int val=p.value(n);
		System.out.println(val);
	}
}