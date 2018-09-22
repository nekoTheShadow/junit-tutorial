package ch19.ex5;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ConsumptionTaxTest {

	@ParameterizedTest
	@MethodSource("getArguments")
	@DisplayName("applyで消費税が加算された価格が取得できる。")
	void testApply(int rate, int price, int expected) {
		var tax = new ConsumptionTax(rate);
		assertThat(tax.apply(price)).isEqualTo(expected);
	}

	static Stream<Arguments> getArguments() {
		return Stream.of(
			Arguments.of(5, 100, 105),
			Arguments.of(5, 3000, 3150),
			Arguments.of(10, 50, 55),
			Arguments.of(5, 50, 52),
			Arguments.of(3, 50, 51)
		);
	}
}
