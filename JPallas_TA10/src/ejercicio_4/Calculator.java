package ejercicio_4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

class Calculator {

	double num1;
	double num2;
	double result;
	String operator;

	void run(Scanner input) {
		String choice = "";

		do {

			System.out.print(
					"Choose an operator: +, -, *, /, pow, sqroot, cubicroot, or type exit to stop the program: ");
			choice = input.next();

			switch (choice) {
			case "+":
				try {
					System.out.print("Enter the first number to sum: ");
					num1 = input.nextDouble();
					System.out.print("Enter the second number to sum: ");
					num2 = input.nextDouble();
					result = num1 + num2;
					System.out.println(num1 + " + " + num2 + " = " + result);
					break;
				} catch (InputMismatchException e) {
					System.out.println("The introduced input is not of numeric value");
				}
			case "-":
				try {
					System.out.print("Enter the first number to substract: ");
					num1 = input.nextDouble();
					System.out.print("Enter the second number to substract: ");
					num2 = input.nextDouble();
					result = num1 - num2;
					System.out.println(num1 + " - " + num2 + " = " + result);
					break;
				} catch (InputMismatchException e) {
					System.out.println("The introduced input is not of numeric value");
				}

			case "*":
				System.out.print("Enter the first number to multiply: ");
				num1 = input.nextDouble();
				System.out.print("Enter the second number to multiply: ");
				num2 = input.nextDouble();
				result = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + result);
				break;
			case "/":
				System.out.print("Enter the first number to divide: ");
				num1 = input.nextDouble();
				System.out.print("Enter the second number to divide: ");
				num2 = input.nextDouble();
				result = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + result);
				break;
			case "pow":
				System.out.print("Enter the first number to power: ");
				num1 = input.nextDouble();
				System.out.print("Power " + num1 + " times: ");
				num2 = input.nextDouble();
				result = Math.pow(num1, num2);
				System.out.println(num1 + " with exponent " + num2 + " = " + result);
				break;
			case "sqroot":
				System.out.print("Enter a number to calculate its square root: ");
				num1 = input.nextDouble();
				result = Math.sqrt(num1);
				System.out.println("The square root of " + num1 + " is " + result);
				break;
			case "cubicroot":
				System.out.print("Enter a number to calculate its cubic root: ");
				num1 = input.nextDouble();
				result = Math.cbrt(num1);
				System.out.println("The square root of " + num1 + " is " + result);
				break;
			case "exit":
				System.out.println("Bye!");
				break;
			default:
				throw new IllegalArgumentException("Invalid operator");
			}

		} while (!choice.equals("exit"));

	}
	
	void processInput() {
		
	}

}
