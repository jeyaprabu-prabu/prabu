package Patternprogramme;

public class Leftangletriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		for (int i = a; i >= 1; i--) 
		{
			for (int j = 1; j <= a; j++)
			{
				if (i <= j)
				{
					System.out.print(i+" ");
				} else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		

	}

}
