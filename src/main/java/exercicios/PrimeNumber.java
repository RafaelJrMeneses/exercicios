package exercicios;

public class PrimeNumber {

	public PrimeNumber() {
	}

//	public boolean isPrime(Integer number) {
//		number = Math.abs(number);
//		if (number % 2 == 0) {
//			return false;
//		}
//		for (long i = 3; i * i <= number; i += 2) {
//			if (number % i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}

	public Boolean isPrime(Integer numero) {
		boolean isPrime = true;

		for (int i = numero - 1; i > 1; i--) {
			if (numero % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
