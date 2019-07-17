package codecheff;
import java.util.*;
public class FindRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int dividend=sc.nextInt();
			int divisor=sc.nextInt();
			System.out.println(dividend%divisor);
		}
	}

}
