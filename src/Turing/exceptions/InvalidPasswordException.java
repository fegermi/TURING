package Turing.exceptions;

public class InvalidPasswordException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidPasswordException() {
        super();
    }

    public InvalidPasswordException(String s) {
        super(s);
    }
		
}
