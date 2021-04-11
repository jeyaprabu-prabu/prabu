package Whileloop;

public class countofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=17498654;
		int count=0;
		while(num != 0)
		{
			count=count+1;
			
			
			num=num /10;
		}
		System.out.println(count);
		
	}

}
