package codecheff;

import java.util.Scanner;

public class PowerNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt(),temp,power=0;
		double res=0;
		while(i!=0)
		{
			temp=i%10;
			res=res+Math.pow(temp,power);
			i=i/10;
			power++;
		}
		System.out.println((int)res);
	}

}
