package ch18.ex4;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {
	@Test
	@DisplayName("入力値に「10」を与えると、trueを返す。")
	void tenIsEven() {
		assertThat(NumberUtils.isEven(10)).isTrue();
	}

	@Test
	@DisplayName("入力値に「7」を与えると、falseを返す。")
	void sevenIsOdd() {
		assertThat(NumberUtils.isEven(7)).isFalse();
	}
}
