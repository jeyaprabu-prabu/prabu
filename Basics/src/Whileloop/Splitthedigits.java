package Whileloop;

public class Splitthedigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=17456;
		int split=0;
		while(num != 0)
		{
			split=num % 10;
			System.out.println(split);
			
			num=num /10;
		}
		
	}

}
