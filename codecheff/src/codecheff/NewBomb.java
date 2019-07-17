package codecheff;
import java.util.Scanner;
public class NewBomb {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),count=0,p=sc.nextInt(),p1=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			a[i][j]=sc.nextInt();
		if(a[p][p1]==1)
			for(int i=p-1;i<=p+1;i++)
				for(int j=p1-1;j<=p1+1;j++)
					if((i>=0&&i<n)&&(j>=0&&j<n))
						if(a[i][j]==1)
							count++;
		System.out.println(count);
	}
}