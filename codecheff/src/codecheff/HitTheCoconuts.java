package codecheff;

import java.util.ArrayList;
import java.util.*;
public class HitTheCoconuts
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int noOfCoconuts=sc.nextInt();
            sc.nextInt();
            ArrayList<Integer> noOfHits=new ArrayList<Integer>();
            for(int i=0;i<noOfCoconuts;i++)
            {
            	int x=sc.nextInt();
            	if(!noOfHits.contains(x))
            		noOfHits.add(x);
            }
            if(noOfHits.size()>1)
            {
            Collections.sort(noOfHits);
            if((noOfHits.get(0)*noOfHits.size())>noOfHits.get(noOfHits.size()-1))
                System.out.println(noOfHits.get(noOfHits.size()-1));
            else
                System.out.println(noOfHits.get(0)*noOfHits.size());
            }
            else
            	System.out.println(noOfHits.get(0));
            t--;
        }
       // sc.close();
    }
}