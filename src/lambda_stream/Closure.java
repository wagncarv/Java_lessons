package lambda_stream;

import java.util.stream.IntStream;

public class Closure {

	public static void main(String[] args) {
		int mult = 2;
		
		IntStream.range(1, 21).map(i -> i * mult).forEach(i -> System.out.print(i + " "));

	}

}
