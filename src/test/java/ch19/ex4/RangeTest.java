package ch19.ex4;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {
	
	@Nested
	@DisplayName("min=0.0、max=10.5のRangeのとき")
	class From0To10_5 {
		private Range range;
		
		@BeforeEach
		void setUp() {
			range = new Range(0, 10.5);
		}
		
		@ParameterizedTest
		@ValueSource(doubles= {0, 10.5})
		@DisplayName("containsはtrueを返す。")
		void isTrue(double x) {
			assertThat(range.contains(x)).isTrue();
		}
		
		@ParameterizedTest
		@ValueSource(doubles= {-0.1, 10.6})
		@DisplayName("containsはfalseを返す。")
		void isFalse(double x) {
			assertThat(range.contains(x)).isFalse();
		}
	}
	
	@Nested
	@DisplayName("min=-5.1、max=5.1のRangeのとき")
	class From_5_1To5_1 {
		private Range range;
		
		@BeforeEach
		void setUp() {
			range = new Range(-5.1, 5.1);
		}
		
		@ParameterizedTest
		@ValueSource(doubles= {-5.1, 5.1})
		@DisplayName("containsはtrueを返す。")
		void isTrue(double x) {
			assertThat(range.contains(x)).isTrue();
		}
		
		@ParameterizedTest
		@ValueSource(doubles= {-5.2, 5.2})
		@DisplayName("containsはfalseを返す。")
		void isFalse(double x) {
			assertThat(range.contains(x)).isFalse();
		}
	}
}
