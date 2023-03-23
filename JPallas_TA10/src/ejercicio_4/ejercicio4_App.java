package ejercicio_4;

import java.util.Scanner;

class ejercicio4_App {

	public static void main(String[] args) {

		// Create input
		Scanner input = new Scanner(System.in);

		// Create calculator
		Calculator c1 = new Calculator();

		// Run calculator
		c1.run(input);

		// Close input
		input.close();

	}

}
