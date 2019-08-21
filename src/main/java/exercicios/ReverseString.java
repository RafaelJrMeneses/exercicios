package exercicios;

public class ReverseString {

	ReverseString(){}
	
	public String reverse(String palavra) {
		String invertida = "";
		for (int i = palavra.length()-1; i >= 0; i--) {
			invertida += palavra.charAt(i);
		}
		return invertida;
	}
}
