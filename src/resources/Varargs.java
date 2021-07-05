package resources;

public class Varargs {

	public static void main(String[] args) {
		
		String arr[]  = {"c", "d", "e", "f"};
		
//		imprimir("a");
//		imprimir("a", "b", "c");
		imprimir(arr);

	}
	
	public static void imprimir(String... textos) {
		for(String str: textos) {
			System.out.println(str);
		}
	}

}
