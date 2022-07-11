class HallowName
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=8;j++)
			{
				if((i==3&&j==6)||(i==7&&j==6))
					System.out.print("* ");
					if(j>6&&i==3 || j>6&& i==7)
						System.out.print(" ");
				else if(i==1||j==1||i==5||i==9||j==8)
					System.out.print("* ");
				else if(j==2&&i==3)
					System.out.print("Hemant");
				else if(j==2&&i==7)
					System.out.print("Gangad");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
}
