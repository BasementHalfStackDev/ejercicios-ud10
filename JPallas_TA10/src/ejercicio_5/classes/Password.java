package ejercicio_5.classes;

import java.util.Random;

public class Password {

	private final String UPPER_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final String LOWER_LETTERS = "abcdefghijklmnopqrstuvwxyz";
	private final String NUMBERS = "0123456789";

	// Attributes
	private int length;
	private String pass;

	// Constructor
	public Password() {
		this.length = 8;
		this.pass = genPasswd(length);
	}

	public Password(int length, String password) {
		this.length = length;
		this.pass = checkPass(password);
	}

	public Password(int length) {
		this.length = length;
		this.pass = genPasswd(length);
	}

	// Getters
	public int getLength() {
		return length;
	}

	public String getPass() {
		return pass;
	}

	// Setters
	public void setLength(int length) {
		this.length = length;
	}

	// Functions
	// Check if strong
	public boolean isStrong() {
		// Counts the number of upper, lowercase letters and numbers
		int upperCount = 0;
		int lowerCount = 0;
		int numCount = 0;
		for (int i = 0; i < pass.length(); i++) {
			for (int j = 0; j < UPPER_LETTERS.length(); j++) {
				if (pass.charAt(i) == UPPER_LETTERS.charAt(j)) {
					upperCount++;
				}
				if (pass.charAt(i) == LOWER_LETTERS.charAt(j)) {
					lowerCount++;
				}
			}
			for (int k = 0; k < NUMBERS.length(); k++) {
				if (pass.charAt(i) == NUMBERS.charAt(k)) {
					numCount++;
				}
			}
		}

		// And returns false or true if the password is considered strong
		if (upperCount > 2 && lowerCount > 1 && numCount > 5) {
			return true;
		}
		return false;
	}

	// Generate password
	String genPasswd(int l) {
		String possible_chars = UPPER_LETTERS + LOWER_LETTERS + NUMBERS;
		Random rand = new Random();
		StringBuilder pass = new StringBuilder();
		for (int i = 0; i < l; i++) {
			int index = rand.nextInt(possible_chars.length());
			char randomChar = possible_chars.charAt(index);
			pass.append(randomChar);
		}
		return pass.toString();
	}

	String checkPass(String pass) {
		try {
			if (length != pass.length()) {
				throw new IllegalArgumentException(
						"Password '" + pass + "' does not match defined length of " + length);
			}
			return pass;
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		return "";
	}

}
