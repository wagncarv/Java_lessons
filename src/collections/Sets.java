package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		//NÃO MANTÉM ORDEM DE INSERÇÃO
//		Set<String> set = new HashSet<>();
		
		//MANTÉM ORDEM DE INSERÇÃO
//		Set<String> set = new LinkedHashSet<>();
		
		//CONJUNTO ORDENADO
		Set<String> set = new TreeSet<>();
		
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("A");
		
		set.forEach(i -> System.out.println(i));

	}

}
