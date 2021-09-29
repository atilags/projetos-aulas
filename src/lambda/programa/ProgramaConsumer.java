package lambda.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import lambda.entidades.ProdutoConsumer;

public class ProgramaConsumer {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner tec = new Scanner(System.in)) {

			List<ProdutoConsumer> list = new ArrayList<>();
			list.add(new ProdutoConsumer("Tv", 900.00));
			list.add(new ProdutoConsumer("Mouse", 50.00));
			list.add(new ProdutoConsumer("Tablet", 350.50));
			list.add(new ProdutoConsumer("HD Case", 80.90));

			// list.forEach(new MeuConsumer(400.0));

			// list.forEach(ProdutoConsumer::staticConsumer);

			// list.forEach(ProdutoConsumer::naoStaticConsumer);

			/*
			 * Consumer<ProdutoConsumer> cons1 = p -> { p.setPrice(p.getPrice() * 1.1); };
			 */
			// Consumer<ProdutoConsumer> cons2 = p -> p.setPrice(p.getPrice() * 1.15);
			// list.forEach(cons1);
			
			/*Consumer<ProdutoConsumer> cons1 = p -> {
				if (p.getPrice() >= 400.0) {
					p.setPrice(p.getPrice() * 1.1);
				}
			};

			list.forEach(cons1);*/

			list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

			list.forEach(System.out::println);
			

		} catch (RuntimeException e) {
			System.out.println("Um erro inexperado ocorreu, sentimos muito.");
		}

	}
}
