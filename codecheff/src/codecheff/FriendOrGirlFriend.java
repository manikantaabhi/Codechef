package codecheff;
import java.util.Scanner;

public class FriendOrGirlFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			long res=0;
			int last=0;
			int n=sc.nextInt();
			String str=sc.next();
			char ch=sc.next().charAt(0);
			for(int i=0;i<n;i++)
			{
				if(str.charAt(i)==ch)
				{
					res+=i+1;
					last=i+1;
				}
				else
				{
					res+=last;
				}
			}
			System.out.println(res);
			
			t--;
		}
	}

}
