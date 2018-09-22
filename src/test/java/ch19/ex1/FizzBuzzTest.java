package ch19.ex1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	@DisplayName("16を指定してcreateFizzBuzzListメソッドを実行すると「1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16」が取得できる")
	void createFizzBuzzFrom1To16() {
		assertThat(FizzBuzz.createFizzBuzzList(16)).containsExactly("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16");
	}

}
