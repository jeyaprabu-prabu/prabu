package Array;

public class SplitArrayBasedOnODDandEvenNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 5, 7, 3, 6 };
		int countodd = 0, counteven = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				counteven = counteven + 1;

			} else {
				countodd = countodd + 1;
			}
		}
		int x[] = new int[counteven];
		int y[] = new int[countodd];
		int j = 0, k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				x[j] = a[i];

				System.out.println("evennumbers=" + x[j]);
				
				j = j + 1;

			} else {
				// if(a[i] % 2 != 0)
				/// {
				y[k] = a[i];

				System.out.println("oddnumbers=" + y[k]);
				k = k + 1;

			}
		}
		System.out.println("even elements:");
		for (int i = 0; i < x.length; i++) {

			System.out.println(x[i]);
		}
		System.out.println("odd elements:");
		for (int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		}
	}
}
