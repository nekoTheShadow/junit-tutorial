package ch18.ex3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest {
	
	private Counter counter;
	
	@BeforeEach
	void setUp() {
		this.counter = new Counter();
	}

	@Test
	@DisplayName("初期状態で、incrementメソッドを実行すると1が取得できる。")
	void firstIncrement() {
		assertThat(counter.increment()).isEqualTo(1);
	}
	
	@Test
	@DisplayName("incrementメソッドを1回実行した状態で、incrementメソッドを実行すると1が取得できる。")
	void secondIncrement() {
		counter.increment();
		assertThat(counter.increment()).isEqualTo(2);
	}
	
	@Test
	@DisplayName("incrementメソッドを50回実行した状態で、incrementメソッドを実行すると51が取得できる。")
	void fiftyOneTimesIncrement() {
		for (int i = 0; i < 50; i++) {
			counter.increment();
		}
		assertThat(counter.increment()).isEqualTo(51);
	}

}
