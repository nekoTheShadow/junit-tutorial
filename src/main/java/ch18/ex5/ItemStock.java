package ch18.ex5;

import java.util.HashMap;
import java.util.Map;

public class ItemStock {
	
	private Map<String, Integer> counter = new HashMap<>();
	
	public void add(Item item) {
		var name = item.getName();
		counter.put(name, counter.getOrDefault(name, 0) + 1);
	}
	
	public int getNum(Item item) {
		return counter.getOrDefault(item.getName(), 0);
	}
}
