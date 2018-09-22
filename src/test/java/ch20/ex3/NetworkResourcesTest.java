package ch20.ex3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NetworkResourcesTest {

	@Test
	@DisplayName("NetworkLoaderが「Hello World」を返すInputStreamを返すとき、NetworkResouresのloadメソッドは「Hello World」を返す。")
	void testLoad() throws IOException {
		var in = new ByteArrayInputStream("Hello World".getBytes());
		var loader = mock(NetworkLoader.class);
		when(loader.getInput()).thenReturn(in);
		
		var resources = new NetworkResources(loader);
		assertThat(resources.load()).isEqualTo("Hello World");
	}

}
