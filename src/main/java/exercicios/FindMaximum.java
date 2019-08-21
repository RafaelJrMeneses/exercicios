package exercicios;

public class FindMaximum {

	public Integer maximum(Integer[] list) {
		int max = list[0];
		for (int listas : list) {
			if (listas > max) {
				max = listas;
			}
		}
		return max;
	}

}
