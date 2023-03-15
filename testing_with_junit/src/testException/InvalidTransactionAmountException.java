package testException;

public class InvalidTransactionAmountException extends RuntimeException {
	//private static final long serialversionUID=ID;
	public InvalidTransactionAmountException(String message) {
		super(message);
	}

}
