package lambda.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import lambda.entidades.ProdutoFunction;
import lambda.utilitarios.MeuFunction;

public class ProgramaFunction {
	
	public static double valor = 100.0;
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner tec = new Scanner(System.in)) {
			
			List<ProdutoFunction> list = new ArrayList<>();
			list.add(new ProdutoFunction("Tv", 900.00));
			list.add(new ProdutoFunction("Mouse", 50.00));
			list.add(new ProdutoFunction("Tablet", 350.50));
			list.add(new ProdutoFunction("HD Case", 80.90));
			
			List<String> nomes = list.stream().map(new MeuFunction()).collect(Collectors.toList());
			
			//List<String> nomes = list.stream().map(ProdutoFunction::staticMeuFunction).collect(Collectors.toList());
			
			//List<String> nomes = list.stream().map(ProdutoFunction::naoStaticMeuFunction).collect(Collectors.toList());
			
			//List<String> nomes = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
			
			/*Function<ProdutoFunction, String> function = p -> p.getPrice() > 100.0? p.getName().toUpperCase(): "Preço baixo demais";
			
			for(ProdutoFunction p: list) {
				System.out.println(function.apply(p));
			}*/
			
			nomes.forEach(System.out::println);

		} catch (RuntimeException e) {
			System.out.println("Um erro inexperado ocorreu, sentimos muito.");
		}

	}
}
