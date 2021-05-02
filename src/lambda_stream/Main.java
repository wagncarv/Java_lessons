package lambda_stream;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Car> cars = List.of(new Car("BMW", 120000), new Car("Renault", 85000), new Car("VW", 70000));
		Main m = new Main();
		System.out.println(m.orderByPrice(cars));
		System.out.println(m.toLower(cars));

	}

	List<Car> orderByPrice(List<Car> cars) {
		return cars.stream().sorted((c1, c2) -> Double.valueOf(c1.getPrice()).compareTo(c2.getPrice()))
				.collect(Collectors.toList());
	}

	List<Car> toLower(List<Car> cars) {
		return orderByPrice(cars).stream().map(c -> new Car(c.getBrand().toLowerCase(), c.getPrice()))
				.peek(Car::addTax)
				.collect(Collectors.toList());
	}

}
