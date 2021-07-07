package resources;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		

		List<String> l = new ArrayList<String>();
		l.add("1");
		l.add("2");
		l.add(3);
		
		for(String s : l) {
			System.out.println(s);
		}
	}

}
