package ch19.ex3;

import static ch19.ex3.TextAbstractAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MultiLineStringTest {

	@Test
	@DisplayName("joinで文字列が連携される。")
	void testJoin() {
		assertThat(MultiLineString.join("Hello", "World")).isSameText("Hello\r\nWorld");
	}

}
