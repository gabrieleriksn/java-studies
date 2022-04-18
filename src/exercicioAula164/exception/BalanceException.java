package exercicioAula164.exception;

public class BalanceException extends Exception {
    
	private static final long serialVersionUID = 1L;

	public BalanceException() {
        super();
    }

    public BalanceException(String message) {
        super(message);
    }
}
