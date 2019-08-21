package exercicios;

public class Fibonacci {

	public Fibonacci() {
	}

//	public static List<Integer> getFibonacci(int series) {
//		return Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(series).map(n -> n[0])
//				.collect(toList());
//	}
//
//	public static void main(String[] args) {
//
//		List<Integer> fibonacci = getFibonacci(9);
//		fibonacci.forEach(x -> System.out.println(x));
//
//	}
	
	public Integer fibonacci(Integer numero) {
		if (numero == 1) {
			return 1;
		} else if (numero == 0) {
			return 0;
		} else {
			return fibonacci(numero - 1) + fibonacci(numero - 2);
		}
	}
}
