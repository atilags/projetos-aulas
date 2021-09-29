package lambda.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import lambda.entidades.ProdutoPredicate;

public class ProgramaBinaryOperator {
	
	public static double valor = 100.0;
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner tec = new Scanner(System.in)) {
			
			List<ProdutoPredicate> list = new ArrayList<>();
			list.add(new ProdutoPredicate("Tv", 900.00));
			list.add(new ProdutoPredicate("Mouse", 50.00));
			list.add(new ProdutoPredicate("Tablet", 350.50));
			list.add(new ProdutoPredicate("HD Case", 80.90));
			
			
			
			list.forEach(System.out::println);
			
		} catch (RuntimeException e) {
			System.out.println("Um erro inexperado ocorreu, sentimos muito.");
		}

	}
}
