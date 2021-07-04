package format;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
//		Random r = new Random();
		
		Random r = new Random(12345678);
		
		for (int i = 0; i < 10; i++) {
//			double d = Math.random();
//			int d = r.nextInt();
			int d = r.nextInt(100);
			System.out.println((i + 1) + " => " + d);
		}

	}

}
