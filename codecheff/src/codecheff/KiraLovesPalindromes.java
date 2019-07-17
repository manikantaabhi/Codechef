package codecheff;
import java.util.*;
public class KiraLovesPalindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int  count=0;
		
		for(int l=0;l<str.length();l++)
		{
			int x=l;
		for(int i=l+1;i<str.length();i++)
		{
			String strConc="";
			String rev="";
			
			for(int j=str.length()-1;j>=i;j--)
			{
				if((str.length()-x)<=0)
					x=0;
				strConc=str.substring(l, i).concat(str.substring(j,str.length()-x));
				System.out.println("Str="+strConc);
				StringBuilder sb=new StringBuilder();
				sb.append(strConc);
				rev=sb.reverse().toString();
				if(strConc.equals(rev))
				{
				System.out.println("yes");
				count++;
				}
				else
					System.out.println("no");
			}
		}
		System.out.println(count);
		}
	}

}
