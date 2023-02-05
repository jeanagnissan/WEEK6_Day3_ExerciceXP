package Exercice4;

public class Exercice4 {


	public static void main(String[] args) {
		System.out.println("Nombres d'Armstrong entre 1 et 500");
		for (int number = 1; number <= 500; number++) {
			int digits = numberOfDigits(number);
			int sum = 0;
			int temp = number;
			while (temp != 0) {
				int lastDigit = temp % 10;
				sum = sum + (int) Math.pow(lastDigit, digits);
				temp = temp / 10;
			}
			if (sum == number) {
				System.out.println(number);
			}
		}

	}

	public static int numberOfDigits(int number) {
		int count = 0;
		while (number != 0) {
			number /= 10;
			count++;
		}
		return count;
	}

}
