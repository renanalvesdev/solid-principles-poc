package pt.com.renan.rh;

public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ValidationException(String mensagem) {
		super(mensagem);
	}

}
