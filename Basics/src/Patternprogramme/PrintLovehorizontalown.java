package Patternprogramme;

public class PrintLovehorizontalown {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpackage Patternprogramme;
		//Print "L"
				int a = 6,b=5;
				for (int i = 1; i <= a; i++){ 
				
					for (int j = 1; j <= b; j++)
					{
						if (j==1||i==6)
						{
							System.out.print(" *");
						} else
						{
							System.out.print("  ");
						}
					}System.out.print("  ");
				
					
				//Print "O"
				
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
					}System.out.print("  ");
					
				//Print "v"
				
				{
					for (int j = 1; j <= 10;j++)
					{
						if (i==j||i+j==11)
						{
							
							System.out.print(" *");
						} else
						{
							System.out.print(" ");
						}
						
					}System.out.print(" ");
					
				//Print "E"
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
				}System.out.print("  ");
	}
}







