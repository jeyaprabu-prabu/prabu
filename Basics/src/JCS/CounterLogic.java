package JCS;

public class CounterLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 48;//7,17,19,23,997 all are prime numbers
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
			{
				System.out.println(i);//To print the factors itself
				count = count + 1; 
			}
		}
		System.out.println(count);//To print count of factors

	}

}
