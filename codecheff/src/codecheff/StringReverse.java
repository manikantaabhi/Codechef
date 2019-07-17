package codecheff;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String temp="",out="";
		str=str.replace(' ','!');
		str=str.replace("!", "! ");
		int x;
		System.out.println(str);
		int l=sc.nextInt();
		int m=l;
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			temp=temp+arr[i];
			if(i==m-1||i==arr.length-1)
			{
				for(int j=temp.length()-1;j>=0;j--)
				{
					out=out+temp.charAt(j);
				}
				out=out+" ";
				temp="";
				m=l+m;
			}
		}
		System.out.println(out);
	}

}
