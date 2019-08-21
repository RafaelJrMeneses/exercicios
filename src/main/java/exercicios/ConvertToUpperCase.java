package exercicios;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {

	ConvertToUpperCase(){}
	
//	public String upperCase(String palavra) {
//		return palavra.toUpperCase();
//	}
	
	public List<String> upperCase(List<String> list) {
		return list.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
	}
}
