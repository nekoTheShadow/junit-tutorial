package ch20.ex6;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HelloWorldTest {
	
	private PrintStream stdout;
	private ByteArrayOutputStream mockStdout;
	
	@BeforeEach
	void setUp() {
		this.stdout = System.out;
		this.mockStdout = new ByteArrayOutputStream();
		System.setOut(new PrintStream(mockStdout));
	}
	
	@AfterEach
	void tearDown() {
		System.setOut(stdout);
	}

	@Test
	@DisplayName("outputにHelloWorldが出力される。")
	void testHelloWorld() {
		var helloWorld = new HelloWorld();
		helloWorld.say();
		assertThat(new String(mockStdout.toByteArray())).isEqualTo("Hello World" + System.lineSeparator());
	}

}
