package lambda_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Colecoes {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>(List.of("João", "Pedro", "Tião", "Joana", "Marta", "Clara", "Celso"));
		Colecoes c = new Colecoes();
		
		c.filterNames(words).forEach(System.out::println);
		c.toLowerCase(words).forEach(System.out::println);

	}
	
	public List<String> filterNames(List<String> words){
		return words.stream()
				.filter(n -> n.startsWith("J"))
				.collect(Collectors.toList());
	}
	
	public List<String> toLowerCase(List<String> words){
		return filterNames(words)
				.stream()
				.map(String::toLowerCase)
				.collect(Collectors.toList());		
	}

}
