
public class Program1 {

	public static void main(String[] args) {
		int sum = 0;
		int number = 1;
		for (int i = 1; i < 1000; i++) {

			if (number % 3 == 0 || number % 5 == 0) {
				sum = sum + number;
				System.out.println(number);
			}
			number += 1;
		}

		System.out.println("sum" + sum);
	}

}
