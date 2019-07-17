package codecheff;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EatTwiceMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		while(t>0)
		{
			int N=sc.nextInt();
			int M=sc.nextInt();
			
			HashMap<Integer,ArrayList> map=new HashMap<Integer,ArrayList>();
			for(int i=0;i<N;i++)
			{
				int day=sc.nextInt();
				int taste=sc.nextInt();
				ArrayList<Integer> list=new ArrayList<Integer>();
				if(list.size()==0)
				{
				list.add(taste);
				map.put(day, list);
				}
				else
				{
					if(map.containsKey(day))
					{
						map.containsValue(list);
					}
				}
				
			
			}
			t--;
		}
}
class Pair
{
	int key;
	int value;
	Pair(int key,int value)
	{
		this.key=key;
		this.value=value;
	}
}
}