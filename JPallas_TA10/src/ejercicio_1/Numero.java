package ejercicio_1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class Numero {

	// Atributos
	private final int MAX = 500;
	private final int MIN = 1;
	private int numero;

	public Numero() {
		this.numero = numeroAleatorio();
	}

	// Getter
	@Override
	public String toString() {
		return "Numero generado es: " + numero;
	}

	public int getNumero() {
		return numero;
	}

	// Setter
	public void setNumero(int numero) {
		this.numero = numero;
	}

	// Metodos
	// Generador de numero aleatorio
	public int numeroAleatorio() {
		Random rand = new Random();
		int numero = rand.nextInt((MAX - MIN) + 1) + MIN;
		return numero;
	}

	// Juego de adivinar el numero generado
	public void iniciarJuego() {
		// Inicializa variables con numero, numero del usuario y intentos
		int n1 = this.numero;
		int n2 = 0;
		int intentos = 1;

		Scanner input = new Scanner(System.in);
		System.out.println("Adivina el numero que estoy pensando! ");

		// Pide en bucle un numero al usuario
		do {
			// Comprueba si es valido en bucle hasta que no de error
			boolean esValido = false;
			while (!esValido) {
				try {
					n2 = input.nextInt();
					input.nextLine();
					esValido = true;
				} catch (InputMismatchException exc1) {
					// Si da error, pide valor numerico y suma a los intentos
					System.out.println("Por favor, introduce un valor numerico");
					input.nextLine();
					intentos++;
				}
			}

			// Compara si es mayor o menor y añade a intentos
			if (n2 > n1) {
				System.out.println("Incorrecto, el numero es menor!");
				intentos++;
			} else if (n1 > n2) {
				System.out.println("Incorrecto, el numero es mayor!");
				intentos++;
			}
		} while (n1 != n2);

		// Felicita al usuario y muestra el numero adivinado junto los intentos
		System.out.println("Correcto! El numero que estaba pensando era el " + this.numero + "! Te ha costado "
				+ intentos + " intentos!");
		input.close();
	}

}
