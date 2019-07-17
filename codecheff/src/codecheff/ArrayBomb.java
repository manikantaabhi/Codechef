package codecheff;

import java.util.Scanner;

public class ArrayBomb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,out=0;
		n=sc.nextInt();
		System.out.println("enter boomb a and b::");
		int a=sc.nextInt(),b=sc.nextInt();
		int arr[][]=new int[n][n];
		System.out.println("enter array elements \n");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		if(a>=0&&a<=n-1&&b>=0&&b<=n-1&&arr[a][b]==1)
		{
			if(a>0&&a<n-1&&b>0&&b<n-1)
				out=arr[a-1][b-1]+arr[a-1][b]+arr[a-1][b+1]+arr[a][b-1]+arr[a][b]+arr[a][b+1]+arr[a+1][b-1]+arr[a+1][b]+arr[a+1][b+1];
			else if(a==0&&b==0)
				out=arr[a][b]+arr[a][b+1]+arr[a+1][b]+arr[a+1][b+1];
			else if(a==n-1&&b==n-1)
				out=arr[a][b]+arr[a][b-1]+arr[a-1][b]+arr[a-1][b-1];
			else if(a==0&&b==n-1)
				out=arr[a][b]+arr[a][b-1]+arr[a+1][b-1]+arr[a+1][b];
			else if(a==n-1&&b==0)
				out=arr[a][b]+arr[a][b+1]+arr[a-1][b]+arr[a-1][b-1];
			else if(b==0)
				out=arr[a][b]+arr[a-1][b]+arr[a+1][b]+arr[a-1][b+1]+arr[a][b+1]+arr[a+1][b+1];
			else if(b==n)
				out=arr[a][b]+arr[a-1][b]+arr[a+1][b]+arr[a-1][b-1]+arr[a][b-1]+arr[a+1][b-1];
			else if(a==0)
				out=arr[a][b-1]+arr[a][b]+arr[a][b+1]+arr[a+1][b-1]+arr[a+1][b]+arr[a+1][b+1];
			else if(a==n)
				out=arr[a][b-1]+arr[a][b]+arr[a][b+1]+arr[a-1][b-1]+arr[a-1][b]+arr[a-1][b+1];
			if(out!=0)
				System.out.println(out);
			else
				System.out.println("no");
		}
		else{
			System.out.println("out of bounds");
		}
	}

}
