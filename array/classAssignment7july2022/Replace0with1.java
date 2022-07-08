public class Replace0with1
{
	public static void main(String args[])
	{
		int a[]=new int[]{26,0,67,45,0,78,54,34,10,0,34};
		System.out.println("---------Old Array----------");
		for(int i=0;i<11;i++)
		{
			System.out.print(a[i]+" ");
			if(a[i]==0)
				a[i]=1;
		}
		System.out.println("\n--------Updated Array--------");
		for(int i=0;i<11;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
