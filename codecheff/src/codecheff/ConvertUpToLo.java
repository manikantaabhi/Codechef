package codecheff;

public class ConvertUpToLo {

	public static void main(String[] args) {
		String str="ManikantaDivya";
		String s="";
		String out="";
		for(int i=0;i<str.length();i++)
		{
			char a=str.charAt(i);
			if(Character.isUpperCase(a))
			{
				s=Character.toString(a);
				s=s.toLowerCase();
				System.out.print(s);
			}
			
			if(Character.isLowerCase(a))
			{
				s=Character.toString(a);
				s=s.toUpperCase();
				System.out.print(s);
			}
			out=out+s;
		}
		System.out.println();
		System.out.println(out);
		System.out.println(str.equalsIgnoreCase(out));
	}

}
