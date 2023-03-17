package ejercicio_2;

public class ejercicio2_App {

	public static void main(String[] args) {

		try {
			System.out.println("Mensaje mostrado por pantalla");
			throw new CustomExceptions(321, "Esto es un objeto Exception.");

		} catch (CustomExceptions ex) {
			System.out.println("Excepcion capturada con codigo de error y mensaje. " + ex.getAll());
		}

	}

}
