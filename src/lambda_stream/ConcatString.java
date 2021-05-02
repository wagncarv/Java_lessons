package lambda_stream;

import java.util.stream.Collectors;

public class ConcatString {

	public static void main(String[] args) {
		String str = "ACBA";
		
		String result = str.chars()
		.map(i -> i - 64)
		.mapToObj(String::valueOf)
		.collect(Collectors.joining("-"));
		
		System.out.println(result);
		

	}

}
