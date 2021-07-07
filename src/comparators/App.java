package comparators;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(1, "Arroz", 15.90);
		Produto p2 = new Produto(4, "Carne", 39.95);
		Produto p3 = new Produto(3, "Feijão", 11.23);
		Produto p4 = new Produto(5, "Açúcar", 8.78);
		Produto p5 = new Produto(2, "óleo", 9.12);
		
//		Set<Produto> produtos = new TreeSet<>();
//		Set<Produto> produtos = new TreeSet<>(new DescricaoComparator());
		
		//USANDO LISTAS
		List<Produto> produtos = new ArrayList<Produto>();
		
//		Collections.sort(produtos);
		
		//USANDO COMPARATOR NA LISTA
		Collections.sort(produtos, new DescricaoComparator());
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		
		produtos.forEach(p -> System.out.println(p));

	}

}
