package TwoDimensionalArray;

public class TwoDsquarepatternprogramme2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int [5][5];
		for(int i=0;i<a.length; i++)
		{
			for (int j=0;j<=a[i].length-1;j++)
			{
				//if( i >= j)
				//{
					a[i][j]=1;
					System.out.print(a[i][j]+" ");
				}
			
				
			}
			System.out.println();
		}



	}


