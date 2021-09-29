package lambda.programa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class ProgramaStream {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		//LOCALIZAR ALGO DENTRO DE UM TIPO DE LISTA
		List<String> nomes = new ArrayList<>(Arrays.asList("Átila", "Muso", "Vanessa", "Musa", "Davi", "Google", "Yahoo", "Leonardo", "Henrique"));
		
		String localizar = nomes.stream().filter(n -> n.charAt(0) == 'M').findFirst().orElse(null); // Localizou o PRIMEIRO local a onde contem o 'M' e alocou na varivel.
		String localizar2 = nomes.stream().filter(n -> n.charAt(0) == 'T').findFirst().orElse("Não encontrado.");
		
		System.out.println("Localizador M: " + localizar);
		System.out.println("Localizador T: " + localizar2);
		
		System.out.println();
		
		//CRIAR STREAM E UTILIZAR MAP E LIMIT DA STREAM
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> st1 = list.stream();
		Stream<Integer> st1Soma = list.stream().map(i -> i + 2); // Map aplica uma função a cada elemento da Stream.
		System.out.println(Arrays.toString(st1.toArray()));
		System.out.println(Arrays.toString(st1Soma.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray())); // Irá realizar a ação 10 vezes.
		
		Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p -> new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}

}
