package codecheff;
import java.util.Scanner;
public class DuplicateWords {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            String str[]=input.split(" ");
            System.out.println(str.length);
            for(int i=0;i<str.length;i++){
            	System.out.println(str[i]);
            }
           for(int i=0;i<str.length;i++)
            {
                for(int j=i+1;j<str.length-1;j++)
                {
                    if(str[i].equalsIgnoreCase(str[j]))
                        str[j]=null;
                }
            }
            for(int i=0;i<str.length;i++)
            {
                if(str[i]==null)
                	continue;
                else
                    System.out.print(str[i]+" ");
            }
        
        in.close();
    }
}