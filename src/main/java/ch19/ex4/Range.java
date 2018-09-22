package ch19.ex4;

public class Range {
	private double min;
	private double max;
	
	public Range(double min, double max) {
		this.min = min;
		this.max = max;
	}
	
	public boolean contains(double x) {
		return min <= x && x <= max;
	}
}
