package exercicios;

public class Factorial {
	
	Factorial(){}

	public Integer factorial(Integer numero) {
		int factorial = numero;
		
		for (int i = numero -1 ; i > 0; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
