package Patternprogramme;

public class Homeworkpgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;

		for (int i = a; i >= 1; i--) 
		{
			for (int j = a; j >= 1; j--)
			{
				if (i >= j)
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

	
	

	

