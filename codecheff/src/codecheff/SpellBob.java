package codecheff;

import java.util.*;
import java.util.Scanner;
class SpellBob
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	String str1,str2;
	for(int i=0;i<t;i++)
	{
		str1=sc.next();
		str2=sc.next();
		if((str1.charAt(0)=='o'||str2.charAt(0)=='0')&&(str1.charAt(1)=='b'||str2.charAt(1)=='b')&&(str1.charAt(0)=='b'||str2.charAt(0)=='b'))
			System.out.println("yes");
		else if((str1.charAt(0)=='b'||str2.charAt(0)=='b')&&(str1.charAt(1)=='o'||str2.charAt(1)=='o')&&(str1.charAt(2)=='b'||str2.charAt(2)=='b'))
			System.out.println("yes");
		else if((str1.charAt(0)=='b'||str2.charAt(0)=='b')&&(str1.charAt(1)=='b'||str2.charAt(1)=='b')&&(str1.charAt(2)=='o'||str2.charAt(2)=='o'))
			System.out.println("yes");
		else
		 	System.out.println("no");
		
	}
}
}