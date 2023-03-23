package ejercicio_3;

class ImparException extends Exception {

	// Atributos
	private int codigoError;
	String mensaje;

	// Constructores

	public ImparException(int error) {
		super();
		this.codigoError = error;
		this.mensaje = "El numero es impar";
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
