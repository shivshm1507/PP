package JavaBasicPrograms;

import java.util.*;
import java.util.stream.*;

class StreamsExample {
	public static void main(String args[]) {

		// create a list of integers
		List<Integer> number = Arrays.asList(2, 3, 4, 5);

		// demonstration of map method
		number.stream().map(x -> x * x).forEach(a->System.out.println("Square :"+a));
		

		// create a list of String
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

		// demonstration of filter method
		List<String> r1 = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println("r1 :" + r1);

		List<String> r2 = names.stream().filter(s -> s.endsWith("m")).collect(Collectors.toList());
		System.out.println(r2);

		// demonstration of sorted method
		List<String> show = names.stream().sorted().collect(Collectors.toList());
		names.stream().sorted().forEach(a -> System.out.println("======" + a));

		System.out.println(show);

		// create a list of integers
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

		// collect method returns a set
		Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());

		System.out.println(squareSet);

		// demonstration of forEach method
		number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

		int[] num = { 1, 2, 4, 3, 5, 4, 3 };
		Arrays.stream(num).distinct().sorted().forEach(y -> System.out.print(y + " "));
		System.out.println();

		Arrays.stream(num).map(x -> x * x).distinct().sorted().forEach(y -> System.out.print(y + " "));

		Arrays.stream(num).filter(x -> x % 2 == 0).forEach(y -> System.out.println("Even :" + y));

		Arrays.stream(num).filter(x -> x % 2 != 0).distinct().forEach(y -> System.out.println("Odd :" + y));

		Arrays.stream(num).distinct().sorted().forEach(y -> System.out.print(y + " "));
		System.out.println();

		Arrays.stream(num).map(x -> x * x).distinct().sorted().forEach(y -> System.out.print(y + " "));

		Arrays.stream(num).filter(x -> x % 2 == 0).forEach(y -> System.out.println("Even :" + y));

		Arrays.stream(num).filter(x -> x % 2 != 0).distinct().forEach(y -> System.out.println("Odd :" + y));
	}
}
