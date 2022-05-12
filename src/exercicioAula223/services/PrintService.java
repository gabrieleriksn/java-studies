package exercicioAula223.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	
	private List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if (!list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}
	
	public void print() {
		String out = "[";
		for (T value : list) {
			if (value == list.get(list.size() - 1)) {
				out += value;
			}
			else {
				out += value + ", ";
			}
		}
		out += "]";
		System.out.println(out);
	}
}
