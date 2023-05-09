package recipes.exception;

@SuppressWarnings("serial")
public class DBException extends RuntimeException {

	public DBException() {
	}

	public DBException(String message) {
		super(message);
	}

	public DBException(Throwable cause) {
		super(cause);
	}

	public DBException(String message, Throwable cause) {
		super(message, cause);
	}
}
