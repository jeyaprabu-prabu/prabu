package Patternprogramme;

public class PrintB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6,b=5;
		for (int i = 1; i <= a; i++) 
		{
			for (int j = 1; j <= b; j++)
			{
				if (i==1 || i==3 ||i==6||j==1||j==5)
				{
					System.out.print(" *");
				} else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}


	}

}
