package codecheff;

public class CommandLineArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="10";
		int i=Integer.parseInt(str);
		Integer in=Integer.valueOf(i);
		System.out.println(in+1);
		int j=in.intValue();
		System.out.println(j+1);
		System.out.println(i+1);
		System.out.println(str+1);
		char a[]={'a','b','c','d'};
		String s=new String(a);
		System.out.println(s);
		
	}

}
