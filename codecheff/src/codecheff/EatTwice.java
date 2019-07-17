package codecheff;

import java.util.ArrayList;
import java.util.Scanner;

public class EatTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int N=sc.nextInt();
			int M=sc.nextInt();
			ArrayList<Integer> dayList=new ArrayList<Integer>();
			ArrayList<Integer> tasteList=new ArrayList<Integer>();
		/*	2
			3 6
			5 7
			1 9
			2 5
			3 7
			5 8
			2 5
			5 10*/
			for(int i=0;i<N;i++){
				int day=sc.nextInt();
				int taste=sc.nextInt();
				//System.out.println("inside");
				if(dayList.size()==0)
				{
					dayList.add(day);
					tasteList.add(taste);
				}
				else
				{
					int size=dayList.size();
					for(int j=0;j<size;j++)
					{
						//System.out.println("inside j3");
						if(day<dayList.get(j))
						{
							dayList.add(j, day);
							tasteList.add(j, taste);
						}
						else
						{
							dayList.add(day);
							tasteList.add(taste);
						}
						//System.out.println("j= "+j+" size= "+dayList.size());
					}
				}
				
			}
			int max=0;
			for(int i=N-2;i>=0;i--)
			{
				if(dayList.get(N-1)==dayList.get(i))
				{
					if(i>0)
					continue;
					else
					{
						if(max<tasteList.get(i)+tasteList.get(N-1))
							max=tasteList.get(i)+tasteList.get(N-1);
					}
				}
				else
				{
					if(max<tasteList.get(N-1)+tasteList.get(i))
						max=tasteList.get(N-1)+tasteList.get(i);
				}	
			}
			System.out.println(max);
			t--;
		}
	}

}
