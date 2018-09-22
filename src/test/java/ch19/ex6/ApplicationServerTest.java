package ch19.ex6;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class ApplicationServerTest {

	@ParameterizedTest
	@CsvFileSource(resources="/support.txt")
	@DisplayName("isSupportのテスト")
	void testIsSupport(ApplicationServer app, Database db, boolean isSupport) {
		assertThat(Framework.isSupport(app, db)).isEqualTo(isSupport);
	}
}
