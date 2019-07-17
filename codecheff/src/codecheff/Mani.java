package codecheff;
import java.math.BigInteger;
import java.util.Scanner;
import java.math.BigInteger;

public class Mani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		BigInteger N=sc.nextBigInteger();
		BigInteger tot_rooms=N.multiply(N);
		//System.out.println(tot_rooms);
		BigInteger inc=BigInteger.valueOf(0);
		BigInteger digit;
		BigInteger res=BigInteger.valueOf(0);
		BigInteger a[]=new BigInteger[tot_rooms.intValue()];
		BigInteger even=BigInteger.valueOf(0);
		BigInteger odd=BigInteger.valueOf(0);
		BigInteger new1=BigInteger.valueOf(345678);
		for(BigInteger i=BigInteger.valueOf(0);i.compareTo(BigInteger.valueOf(5))<0;i=i.add(BigInteger.valueOf(1)))
		{
		while(new1.compareTo(BigInteger.valueOf(0))>0)
		{
			digit=new1.mod(BigInteger.valueOf(10));
			new1=new1.divide(BigInteger.valueOf(10));
			if(digit.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0)))
			{
				even=even.add(digit);
			}
			else
			{
				odd=odd.add(digit);
			}
		}
		res=res.add(even.max(odd).subtract(even.min(odd)));
		System.out.println(res);
		}
	}

}
