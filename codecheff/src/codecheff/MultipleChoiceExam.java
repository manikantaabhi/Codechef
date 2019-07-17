package codecheff;

import java.util.Scanner;

public class MultipleChoiceExam {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int n=sc.nextInt();
			String original=sc.next();
			String answered=sc.next();
			int count=0;
			for(int i=0;i<n;i++)
			{
				if(original.equals(answered))
				{
					count=n;
					break;
				}
				else
				{
					if(answered.charAt(i)=='N')
						continue;
					else
					{
						if(answered.charAt(i)==original.charAt(i))
							count++;
						else if(answered.charAt(i)!=original.charAt(i))
						{
							if(i<n-1)
								i++;
						}
					}
				}
			}
			System.out.println(count);
			t--;
		}
		
	}
}
