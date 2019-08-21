package exercicios;

import java.util.List;

public class AverageValue {

	public AverageValue() {}
	
	public Double average(List<Integer> list) {
		return list.stream()
				//retorna um IntStream aplicando a função dada a este fluxo.
				  .mapToInt(i -> i)
				//retorna a média aritmética de elementos desse fluxo 
				//ou um opcional vazio se esse fluxo estiver vazio.  
				  .average()
				//retorna valor 
				//Se um valor estiver presente no objeto OptionalDouble, caso contrário
				//lançará NoSuchElementException .  
				  .getAsDouble();
	}
}
