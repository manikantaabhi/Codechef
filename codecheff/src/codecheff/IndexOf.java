package codecheff;
// second occuranc of character in a string
public class IndexOf {

	public static void main(String[] args) {
		String str="hii hello gd mrng";/*
		System.out.println(str.lastIndexOf('l'));*/
		char a[]=str.toCharArray();
		int val=0;
		int occ=0;
		for(char s:a)
		{
			val++;
			if(s=='l')
				occ++;
			if(occ==2)
				break;
		}
		System.out.println(val);
	}

}
