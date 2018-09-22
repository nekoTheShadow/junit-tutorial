package ch18.ex1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	@DisplayName("「aaa」を入力すると「aaa」が取得できる。")
	void from_aaa_to_aaa() {
		assertThat(StringUtils.toSnakeCase("aaa")).isEqualTo("aaa");
	}
	
	@Test
	@DisplayName("「HelloWorld」を入力すると「hello_world」が取得できる。")
	void from_HelloWorld_to_hello_world() {
		assertThat(StringUtils.toSnakeCase("HelloWorld")).isEqualTo("hello_world");
	}

	@Test
	@DisplayName("「practice_junit」を入力すると「practice_junit」が取得できる。")
	void from_practiceJunit_to_practice_junit() {
		assertThat(StringUtils.toSnakeCase("practiceJunit")).isEqualTo("practice_junit");
	}
}
