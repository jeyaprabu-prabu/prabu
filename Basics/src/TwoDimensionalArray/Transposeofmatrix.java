package TwoDimensionalArray;

public class Transposeofmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 7, 9, 3 }, { 2, 1, 13 }, { 4, 1, 3 } };
int b[][] = new int[3][3];
		for (int i = 0; i < a.length; i++)// row
		{
			for (int j = 0; j < a[i].length; j++)// column
			{
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();

		}

		for (int i = 0; i < a.length; i++)// row
		{
			for (int j = 0; j < a[i].length; j++)// column
			{

				b[i][j] = a[j][i];

				System.out.print(b[i][j] + "  ");
			}
			System.out.println();

		}
	}
}
