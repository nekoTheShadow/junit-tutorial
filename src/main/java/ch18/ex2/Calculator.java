package ch18.ex2;

public class Calculator {
	public int divide(int x, int y) {
		if (y == 0) {
			throw new IllegalArgumentException("divided by zero");
		}
		return x / y;
	}
}
