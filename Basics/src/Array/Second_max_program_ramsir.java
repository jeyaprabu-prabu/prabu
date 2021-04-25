package Array;

public class Second_max_program_ramsir {

	public static void main(String[] args) {
                int a[] = { 4, 5, 6, 874, 435, 5, 4, 456, 765913, 57, 99, 84 };
				int temp = 0;
				///REMOVING DUPLICATES
				for (int i = 0; i < a.length; i++) {
					for (int j = i + 1; j < a.length; j++) {
						if (a[i] == a[j]) {
							a[i] = 0;
						}
					}
				}
				//SORTING IN ASCENDING ORDER
				for (int i = 0; i < a.length; i++) {
					for (int j = i + 1; j < a.length; j++) {
						if (a[i] < a[j]) {
							temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
				}
				//PRINTING SORTED ELEMENTS
				int k = 0;
				for (int i = 0; i < a.length; i++) {
					if (a[i] != 0) {
						a[k] = a[i];
						k = k + 1;
						System.out.print(a[i] + " ");
					}
				}
				System.out.println();
				System.out.println(a[1]);
			}

		}

	



