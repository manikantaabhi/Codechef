package codecheff;

import java.util.Scanner;

public class MUJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    String str=sc.next();
		    if(str.contains("MUJ"))
		    System.out.print("YES");
		    else
		    System.out.print("NO");
		}
	}

}
