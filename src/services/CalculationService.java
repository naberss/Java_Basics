package services;

import java.util.List;

public class CalculationService {

	//M�todo de tipo gen�rico que implementa a interface comparable para o uso da func��o compareTo
	public static <T extends Comparable<T>> T myMethod(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("Not again bro,jeez ...");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
	
	//M�todo gen�rico que implementa a interface comparable para elementos do tipo T e super classes deste mesmo tipo
	public static <T extends Comparable<? super T>> T myMethod2(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("Not again bro,jeez ...");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}

}
