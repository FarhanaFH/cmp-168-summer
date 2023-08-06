public class UnqualifiedShowDogException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnqualifiedShowDogException() {
        super("Unqualified Show Dog: The show dog is unqualified.");
    }

    public UnqualifiedShowDogException(String message) {
        super(message);
    }
}
