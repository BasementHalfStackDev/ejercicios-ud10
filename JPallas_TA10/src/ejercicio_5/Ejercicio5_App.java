package ejercicio_5;

import java.util.InputMismatchException;
import java.util.Scanner;

import ejercicio_5.classes.Password;

public class Ejercicio5_App {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = getArrayLength(input); // Gets length of password array from user
		int l = getPassLength(input); // Gets length of generated passwords from user

		input.close();

		// Creates arrays based on specified length
		Password[] passwords = new Password[n];
		boolean[] areStrong = new boolean[n];

		passwords = generatePasswordArray(passwords, n, l); // Fills the password array with randomly generated
															// passwords
		areStrong = generateAreStrongArray(passwords, areStrong); // Fills the array checking the strength of each
																	// password

		visualizeStrong(passwords, areStrong); // Displays passwords and strength

	}

	// Functions
	// Function to get array length from user, 100 max, 1 min
	private static int getArrayLength(Scanner input) {
		int n = 0;

		while (true) {
			System.out.print("Insert the ammount of passwords to generate: ");
			try {

				n = input.nextInt();
				if (n > 100) {
					throw new IllegalArgumentException("Ammount of passwords to generate must be smaller than 100");
				}
				if (n < 1) {
					throw new IllegalArgumentException("Ammount of passwords to generate must be higher than 1");
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Please enter a valid integer value");
				input.next();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		return n;
	}

	// Function to get valid password length between 8 and 30 characters
	private static int getPassLength(Scanner input) {
		int l = 0;

		while (true) {
			System.out.print("Insert the length of the passwords to generate: ");
			try {
				l = input.nextInt();
				if (l > 30 || l < 8) {
					throw new IllegalArgumentException("Password length must be between 8 and 30 characters");
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Please enter a valid integer value");
				input.next();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		return l;
	}

	// Fills password array with specified ammount of passwords and length
	private static Password[] generatePasswordArray(Password[] passwords, int n, int l) {
		for (int i = 0; i < n; i++) {
			passwords[i] = new Password(l);
		}
		return passwords;
	}

	// Checks password array strength of each individual password
	private static boolean[] generateAreStrongArray(Password[] passwords, boolean[] boolList) {
		for (int i = 0; i < passwords.length; i++) {
			boolList[i] = passwords[i].isStrong();
		}
		return boolList;
	}

	// Shows each individual pass and its strength
	private static void visualizeStrong(Password[] passwords, boolean[] boolList) {
		for (int i = 0; i < passwords.length; i++) {
			System.out.println("Is password '" + passwords[i].getPass() + "' strong? " + boolList[i]);
		}
	}

}
