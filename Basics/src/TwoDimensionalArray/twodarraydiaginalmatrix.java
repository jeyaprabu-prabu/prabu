package TwoDimensionalArray;

public class twodarraydiaginalmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[][]=new int[5][5];
		for(int i=0;i<c.length; i++)//row
		{
			for(int j=0;j<c[i].length; j++)//column
			{
				if(i ==j)
				{
				c[i][j]=1;
				}
				System.out.print(c[i][j]+"  ");				
			}
			System.out.println();

		}


	}

}
