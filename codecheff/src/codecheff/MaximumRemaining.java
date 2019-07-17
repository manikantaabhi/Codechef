package codecheff;
import java.util.*;
public class MaximumRemaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		long max=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(max<(a[i]%a[j]))
					max=a[i]%a[j];
			}
		}
		System.out.println(max);
	}

}
