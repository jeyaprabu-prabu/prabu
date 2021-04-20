package Stringhomework;

public class Printing_COMPUTER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="COMPUTER";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<=i; j++)
			{
				
				System.out.print(c[j]+" ");
			}
		System.out.println();
		}
	}

}
