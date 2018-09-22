package ch19.ex5;

public class ConsumptionTax {
	private int rate;
	
	public ConsumptionTax(int rate) {
		this.rate = rate;
	}
	
	public int apply(int amount) {
		return amount + (amount * rate / 100);
	}
}
