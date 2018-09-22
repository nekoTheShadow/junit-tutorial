package ch19.ex3;

public class MultiLineString {
	public static String join(String ... lines) {
		return String.join(System.lineSeparator(), lines);
	}
}
