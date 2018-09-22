package ch18.ex2;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	@Test
	@DisplayName("第2引数に0を指定してdivideを呼び出すと、IllegalArgumentExceptionが発生する。")
	void dividedByZero() {
		var c = new Calculator();
		assertThrows(IllegalArgumentException.class, () -> c.divide(100, 0));
	}
}
