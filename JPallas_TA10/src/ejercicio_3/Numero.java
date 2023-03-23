package ejercicio_3;

import java.util.Random;

class Numero {

	// Atributos
	int valor;

	// Constructor
	Numero() {
		this.valor = randomNum();
		System.out.println("Numero generado: " + valor);
	}

	// Metodos
	// Generador de numero
	int randomNum() {
		Random rand = new Random();
		int num = rand.nextInt(200) + 1;
		return num;
	}

	boolean esPar() {
		if (valor % 2 == 0) {
			return true;
		} else
			return false;
	}

}
