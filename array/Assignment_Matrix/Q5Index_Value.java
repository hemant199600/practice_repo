package Assignment_Matrix;

public class Q5Index_Value {

	public void show()
	{
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print("["+i+"]["+j+"]"+a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Q5Index_Value obj=new Q5Index_Value();
		obj.show();
	}

}
