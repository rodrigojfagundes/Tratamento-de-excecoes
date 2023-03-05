package model.exceptions;


public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	//metodo q vai receber a mensagem de exception
	public DomainException(String msg) {
		super(msg);
	}
}
