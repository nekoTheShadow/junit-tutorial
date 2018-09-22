package ch19.ex1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

	public static List<String> createFizzBuzzList(int n) {
		return IntStream.rangeClosed(1, n).mapToObj(FizzBuzz::fizzbuzz).collect(Collectors.toList());
	}
	
	private static String fizzbuzz(int n) {
		if (n % 15 == 0) {
			return "FizzBuzz";
		}
		
		if (n % 3 == 0) {
			return "Fizz";
		}
		
		if (n % 5 == 0) {
			return "Buzz";
		}
		
		return Integer.toString(n);
	}
}
