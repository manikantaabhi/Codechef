package codecheff;

import java.util.ArrayList;
import java.util.Scanner;

public class StringDifference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1[]=str.split(" ");
		for(String s:str1)
		{
			int temp=0;
			s=s.toLowerCase();
			char c[]=s.toCharArray();
			for(int j=0;j<c.length/2;j++){
				temp=temp+((  ( (int)c[j] )-96  )-( ((int)c[c.length-(j+1)])-96 ));
				if((j+1)==c.length-(j+2))
					temp=temp+((int)c[j+1]-96);
			}
			System.out.print(Math.abs(temp));
		}
	}

}
