import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Sum value  "+c);
		sc.close();


	}

}
