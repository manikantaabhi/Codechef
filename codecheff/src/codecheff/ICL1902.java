package codecheff;

import java.util.Scanner;

public class ICL1902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			double x=sc.nextInt();
			double y=x;
			double res;
			int count=0;
			double val=0;
			double root=0;
			for(int j=0;j<10;j++)
			{
				count++;
				if(j==0)
				root=Math.floor(Math.sqrt(x));
				else
					root=Math.floor(Math.sqrt(y));

				System.out.println("root="+root);
				System.out.println("x="+x);
				val=root*root;
				y=x-val;
				System.out.println("y="+y);
				if(y==0)
					break;
				else
				{
					
						root-=1;
						count=0;
				}
			}
			System.out.println(count);
		}

	}

}
