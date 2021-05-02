package lambda_stream;

import java.util.Map;
import java.util.Optional;

public class UsingOptional {
	private static final Map<String, Integer> PEOPLE = Map.of("Pedro", 15, "Maria", 20, "Paulo", 25, "Jorge", 10);

	public static void main(String[] args) {
		Optional<Integer> opt = get("Jorge");
		
//		int idade = opt.orElse(0);
//		int idade = opt.orElseThrow();
//		int idade = opt.orElseThrow(IllegalArgumentException::new);
//		opt.ifPresent(i -> System.out.println("A idade " + i + " foi encontrada"));
		opt.ifPresentOrElse(i -> System.out.println("A idade " + i + " foi encontrada"), () -> System.out.println("Não encotrado"));
		
//		System.out.println(idade);

	}
	
	private static Optional<Integer> get(String name){
		return Optional.ofNullable(PEOPLE.get(name));
	}

}
