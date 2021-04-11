package Forloop;

public class removeduplicatesAndthensortinascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 9, 7, 11, 13, 7, 4, 5, 6, 11, 4, 9, 1 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = 0;
				}
			}
		}
		// for(int i=0; i<a.length;i++)
		// {
		//// System.out.println(a[i]);
		// }
		///
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
