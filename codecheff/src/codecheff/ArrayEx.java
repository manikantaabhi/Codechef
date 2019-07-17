package codecheff;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,2,5,3,6,7,8};
		int val,count=0;;
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			val=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				if(val==a[j])
				{
					flag=1;
					a[j]=a[j]+1;
					break;
				}
			}
			if(flag==1)
				break;
		}
		for(int l:a)
		{
			count=count+l;
		}
		System.out.println(count);
	}

}
