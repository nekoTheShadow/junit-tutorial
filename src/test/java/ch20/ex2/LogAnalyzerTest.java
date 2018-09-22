package ch20.ex2;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LogAnalyzerTest {

	@Test
	@DisplayName("LogLoaderが例外を創出するとき、AnalyzeExceptionが再送出される。")
	void testAnaluzeException() throws IOException {
		var error = new IOException("error by stub");
		var mockLoader = mock(LogLoader.class);
		when(mockLoader.load("test")).thenThrow(error);
		assertThatThrownBy(() -> LogAnalyzer.of(mockLoader).analyze("test"))
			.isInstanceOf(AnalyzeException.class)
			.hasMessageContaining("error by stub");
	}

}
