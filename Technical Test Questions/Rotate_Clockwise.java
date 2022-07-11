/*
Given an array, rotate the array by one position in clock-wise direction.
*/
public class Rotate_Clockwise
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5};
		int temp;
		System.out.print("Given Array: ");
		for(int i=0;i<5;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		for(int i=0;i<1;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		System.out.print("After rotating Array: ");	
		for(int i=0;i<5;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}
