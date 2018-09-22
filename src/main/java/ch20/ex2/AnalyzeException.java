package ch20.ex2;

public class AnalyzeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AnalyzeException(Throwable t) {
		super(t);
	}
}
