package Forloop;

public class Tripleforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=10; i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+" "+j);
				count = count+1;
			}//System.out.println("no of counts==>>"+count);
			for(int j=11;j<=20;j++)
			{
				System.out.println(i+" "+j);
				count = count+1;
			}//System.out.println("no of counts++>>"+count);
		
		}
		System.out.println("no of counts=="+count);

	}

}
