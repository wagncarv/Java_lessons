package resources;

public class Varargs {

	public static void main(String[] args) {
		
		String arr[]  = {"c", "d", "e", "f"};
		
//		imprimir("a");
//		imprimir("a", "b", "c");
//		imprimir(arr);
		
		int[][] array = new int[2][2];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.println(array[i][j]);
			}
		}

	}
	
	public static void imprimir(String... textos) {
		for(String str: textos) {
			System.out.println(str);
		}
	}

}
