package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		for(int i = 1; i <= 10; i++) {
			l.add(i);
		}
		
		l.forEach(i -> System.out.println(i));
	}

}
