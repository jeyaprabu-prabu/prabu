package Stringhomework;

public class Printing_JAVA_WITH_LEFT_TOP_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		char c[]=s.toCharArray();
		
		for(int i=0; i<c.length; i++)
		{
			for(int j=0 ; j<c.length ; j++)
			{
				if(i+j<c.length)
				{			
				
				System.out.print(c[j]+" ");
			     }
				else
				{
					System.out.print("  ");
				}	
		
			}System.out.println();
		}

	}


	}


