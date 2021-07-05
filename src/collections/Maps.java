package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Maps {

	public static void main(String[] args) {
		
		//SEM ORDEM
//		Map<Integer, Produto> map = new HashMap<>();
		
		// ORDEM DE INSERÇÃO MANTIDA
//		Map<Integer, Produto> map = new HashMap<>();
		
		// ORDENA AS CHAVES
		Map<Integer, Produto> map = new TreeMap<>();
		
		map.put(1, new Produto(1, "Açúcar"));
		map.put(3, new Produto(3, "Arroz"));
		map.put(5, new Produto(2, "Leite"));
		map.put(2, new Produto(4, "Pão"));
		map.put(6, new Produto(1, "Pipoca"));
		
//		System.out.println(map.get(3));
		
		//ITERAR SOBRE CHAVES
		for(int key : map.keySet()) {
//			System.out.println(key);
		}
		
		//ITERAR SOBRE VALORES
		for(Produto p : map.values()) {
//			System.out.println(p);
		}
		
		//ITERAR SOBRE PAR CHAVES - VALORES
		Set<Map.Entry<Integer, Produto>> entries = map.entrySet();
		for(Map.Entry<Integer, Produto> entry : entries) {
//			System.out.println(entry);
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}

	}

}
