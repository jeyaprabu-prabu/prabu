package Patternprogramme;

public class PrintLOVE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print "L"
				int a = 6,b=5;
				for (int i = 1; i <= a; i++) 
				{
					for (int j = 1; j <= b; j++)
					{
						if (j==1||i==6)
						{
							System.out.print(" *");
						} else
						{
							System.out.print("  ");
						}
					}
				
					System.out.println("   ");
				}
				System.out.println();
				//Print "O"
				
				for (int i = 1; i <= a; i++) 
				{
					for (int j = 1; j <= b; j++)
					{
						if (i==1||i==6||j==1||j==5)
						{
							System.out.print(" *");
						} else
						{
							System.out.print("  ");
						}
					}
					System.out.println();
				}
				System.out.println();
				//Print "v"
				for (int i = 1; i <= 5; i++) 
				{
					for (int j = 1; j <= 9;j++)
					{
						if (i==j||i+j==10)
						{
							
							System.out.print("*");
						} else
						{
							System.out.print(" ");
						}
						
					}
					System.out.println();
				}System.out.println();
				//Print "E"
				for (int i = 1; i <= a; i++) 
				{
					for (int j = 1; j <= b; j++)
					{
						if (i==1||j==1||i==6 ||i==3)
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


