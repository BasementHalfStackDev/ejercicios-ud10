package ejercicio_4;

public class CustomExceptions extends Exception {

	private static final long serialVersionUID = 001;
	
	// Atributos
	private int codigoError;
	String mensaje;

	// Constructores

	public CustomExceptions(int codigoError, String mensaje) {
		super();
		this.codigoError = codigoError;
		this.mensaje = mensaje;
	}

	// Metodo para mostrar mensaje segun codigo de error
	public int getCodigoError() {
		return codigoError;
	}

	public String getMensaje() {
		return mensaje;
	}

	public String getAll() {
		return "Codigo: '" + this.codigoError + "' Mensaje: '" + this.mensaje + "'";
	}

}
