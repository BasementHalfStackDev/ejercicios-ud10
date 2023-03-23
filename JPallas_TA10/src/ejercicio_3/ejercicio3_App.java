package ejercicio_3;

public class ejercicio3_App {

	public static void main(String[] args) {

		Numero n1 = new Numero();

		try {
			if (n1.esPar()) {
				throw new ParException(1);
			} else {
				throw new ImparException(2);
			}
		} catch (ParException e) {
			System.out.println(e.getMessage());
		} catch (ImparException e) {
			System.out.println(e.getMessage());
		}

	}

}
