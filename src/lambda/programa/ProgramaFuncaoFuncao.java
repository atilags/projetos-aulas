package lambda.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import lambda.entidades.ProdutoPredicate;
import lambda.utilitarios.Somatoria;

public class ProgramaFuncaoFuncao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<ProdutoPredicate> list = new ArrayList<>();
		list.add(new ProdutoPredicate("Tv", 900.00));
		list.add(new ProdutoPredicate("Mouse", 50.00));
		list.add(new ProdutoPredicate("Tablet", 350.50));
		list.add(new ProdutoPredicate("HD Case", 80.90));
		
		Somatoria somando = new Somatoria();
		
		double soma = somando.filtragemSoma(list, p -> p.getPrice() > 100.0);
		double soma2 = somando.filtragemSoma(list, p -> p.getName().charAt(0) == 'T');
		double soma3 = somando.filtragemSoma(list, p -> p.getName().length() > 3);
		
		System.out.println("Somatoria: " + String.format("%.2f", soma));
		System.out.println("Somatoria: " + String.format("%.2f", soma2));
		System.out.println("Somatoria: " + String.format("%.2f", soma3));
		
	}

}
