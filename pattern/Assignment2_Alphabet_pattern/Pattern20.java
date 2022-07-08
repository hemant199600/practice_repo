/*
A 
B C 
D E F 
G H I J 
K L M N O 
P Q R S T U 
V W X Y Z [ \ 
*/
class Pattern20
{
	public static void main(String args[])
	{
		int c=65;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)c+" ");
				c++;	
			}
		System.out.println();
		}
	}
}
