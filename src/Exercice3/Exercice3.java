package Exercice3;

import java.util.Scanner;

public class Exercice3 {


	public static void main(String[] args) {		
		
		System.out.print("Veillez entrée un nombre ");
		Scanner scanner = new Scanner(System.in);
		
		Integer userNumber = scanner.nextInt();
		Integer reverse = 0;
		
		while (userNumber != 0) {
			int  remainder = userNumber % 10;
			reverse = reverse * 10 + remainder;  
			userNumber = userNumber/10;  
		}
		System.out.println("le nombre renversé est : " + reverse);  

	}

}
