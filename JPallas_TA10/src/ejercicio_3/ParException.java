package ejercicio_3;

class ParException extends Exception {

	// Atributos
	private int codigoError;
	String mensaje;

	// Constructores

	public ParException(int error) {
		super();
		this.codigoError = error;
		this.mensaje = "El numero es par";
	}

	// Metodo para mostrar mensaje segun codigo de error
	public int getCodigoError() {
		return codigoError;
	}

	public String getMessage() {
		return mensaje;
	}

	public String getAll() {
		return "Codigo: '" + this.codigoError + "' Mensaje: '" + this.mensaje + "'";
	}

}
