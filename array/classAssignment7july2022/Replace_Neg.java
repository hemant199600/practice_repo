import java.util.Scanner;
public class Replace_Neg
{
	public static void main(String args[])
	{
		int c=0;
		Scanner sc=new Scanner(System.in);
		int a[]={12,3,-19,29,5,-61,44,7,-9};
		System.out.print(" Before Replacing: ");
		for(int i=0;i<9;i++)
		{
			System.out.print(a[i]+" ");
		}		
		for(int i=0;i<9;i++)
		{
			for(int j=i+1;j<9;j++)
			{
				if(a[j]<0)
				{
					//System.out.print(a[i]+" ");
					a[j]=(a[j-1]*a[j-1]);
				}
			}
		}
		System.out.print("\nAfter replacing: ");
		for(int i=0;i<9;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
