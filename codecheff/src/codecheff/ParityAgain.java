package codecheff;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ParityAgain
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>0)
		{
			ArrayList<Integer> list=new ArrayList<Integer>();
			int n=sc.nextInt();
			int odd=0;
			int even=0;
			int iValue=0;
			int flag=0;
			for(int i=0;i<n;i++)
			{
				
				int x=sc.nextInt();
				if(list.contains(x))
					continue;
				if(list.size()==0)
				{
					list.add(x);
					//System.out.println("x="+x);
					int count=countOnes(x);
					if(count%2==0)
						even+=1;
					else
						odd++;
				}
				else
				{
					
					if(list.contains(x))
					{
						
					}
					else
					{
						int size=list.size();
						for(int j=0;j<size;j++)
						{
							//System.out.println("hii");
							list.add(x^list.get(j));
							//System.out.println("x="+(x^list.get(j)));
							int count=countOnes(x^list.get(j));
							if(count%2==0)
								even++;
							else
								odd++;
						}
						list.add(x);
						//System.out.println("x="+x);
						int count=countOnes(x);
						if(count%2==0)
							even++;
						else
							odd++;
					}
				}
				System.out.println(even+" "+odd);
				//Collections.sort(list);
				//System.out.println(list);
				if(even>0&&odd>0)
				{
					iValue=i+1;
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				
				//System.out.println("hii");
				int ans=(int) Math.pow(2, iValue);
				int fasak1=ans-1,fasak2=ans;
				for(int i=iValue;i<n;i++)
				{
					int val=sc.nextInt();
					if(val>(int) Math.pow(2, iValue))
					{
					System.out.println(fasak1+" "+fasak2);
					fasak1+=fasak2;
					fasak2=fasak1+1;
					}
				}
			}
			t--;
		}
	}
	public static int countOnes(int number){
	    int count = 0;
		while(number>0)
		{ 
			++count;
			number &= number-1;
		} 
		return count;
	}
}
