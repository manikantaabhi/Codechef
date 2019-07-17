package codecheff;

import java.util.Scanner;

public class RemoveCharAtPos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="manikantaDivya";
		int pos=sc.nextInt();
		System.out.println((str.substring(0,pos-1)+str.substring(pos)));
	}

}
