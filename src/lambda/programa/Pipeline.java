package lambda.programa;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pipeline {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Integer> numeros = Arrays.asList(8, 9, 8, 10, 5);
		
		Stream<Integer> st1 = numeros.stream().map(n -> n * 10);
		
		System.out.println(Arrays.toString(st1.toArray()));
		
		int soma = numeros.stream().reduce(0, (a, b) -> a+b);

		System.out.println(soma);
		
		List<Integer> listinha = numeros.stream()
				.filter(n -> n % 2 == 0)
				.map(n -> n*10)
				.filter(n -> n > 80)
				.collect(Collectors.toList());
		
		//listinha.forEach(System.out::println);
		System.out.println(Arrays.toString(listinha.toArray()));
		System.out.println();
		
		List<Double> divi = Arrays.asList(5.0,25.0);
		double div = divi.stream().reduce(1.0, (a, b) -> b/a);
		System.out.println(div);
		
		//System.out.println (Stream.of(3,27).reduce(1, (a,b) -> b/a));
	}

}
