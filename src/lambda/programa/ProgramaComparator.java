package lambda.programa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lambda.entidades.ProdutoComparator;

public class ProgramaComparator {
	
	public static int compareProdutos(ProdutoComparator p1, ProdutoComparator p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		}

	public static void main(String[] args) {

		List<ProdutoComparator> list = new ArrayList<>();

		list.add(new ProdutoComparator("TV", 900.00));
		list.add(new ProdutoComparator("Notebook", 1200.00));
		list.add(new ProdutoComparator("Tablet", 450.00));
		
		/*
		Definindo comparator no proprio programa
		
		Comparator<ProdutoComparator> comp = new Comparator<ProdutoComparator>() {
			@Override
			public int compare(ProdutoComparator p1, ProdutoComparator p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
			
		};
		
		Comparator<ProdutoComparator> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		
		Comparator<ProdutoComparator> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		Comparator<ProdutoComparator> comp2 = (p1, p2) -> p1.getPrice().compareTo(p2.getPrice());
		
		list.sort(comp);
		*/
		
		//Comparator Classe list.sort(new MeuComparator());
		
		// list.sort(ProgramaComparator::compareProdutos);
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase())); //Lambda 
		
		list.forEach(System.out::println);
		
		/*
		for (ProdutoComparator p : list) {
			System.out.println(p);
		}
		*/
		
		List<Integer> lista = new ArrayList<>(Arrays.asList(2,2,2,2,12));
		Integer soma = lista.stream().reduce(0, Integer::sum);
		
		//BinaryOperator<Integer> somar = (a, b) -> a-b;
		//Integer soma = lista.stream().reduce(0, somar);
		
		System.out.println(soma);
	}
}