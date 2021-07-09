package aulas;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		List<String> lista = new ArrayList<>();
		
		List<Integer> lista2 = new ArrayList<>();
		
		lista2.add(2);
		lista2.add(3);
		lista2.add(1);
		
		Collections.sort(lista2); // Organiza a lista na ordem crescente
		
		System.out.println(lista2.get(lista2.size()-1));
		
		System.out.println();
		
		lista.add("�tila");
		lista.add("Vanessa");
		lista.add("Musa");
		lista.add("Benita");
		lista.add("Benito");
		lista.add(1, "Davidson"); // Adicionou Davidson na posi��o 1
		lista.add("Musa");
		
		System.out.println(lista.get(2) + "\n"); // Mostra lista na posi��o 2
		
		System.out.println("Tamanho da lista: " + lista.size() + "\n"); // Mostra o tamanho da lista
		
		//lista.remove("Davidson"); // Compara todos os locais na lista que tenh�o a String Davidson e remove.
		//lista.remove(0); // Remove o que tiver na posi��o 0 da lista.
		
		//lista.removeIf(n -> n.charAt(0) == 'B'); // Compara se qualquer variavel da lista na posi��o 0, primeira letra, come�a com B e remove.
		
		//int posicao = lista.indexOf("Musa"); // Localiza em qual posi��o est� o desejado. Ou seja, a onde est� Musa? Na posi��o 3.
		
		System.out.println("Posi��o de Musa na lista: " + lista.indexOf("Musa") + "\n");
		
		System.out.println("Ultima posi��o de Musa na lista: " + lista.lastIndexOf("Musa") + "\n");
		
		System.out.println("Posi��o de Larissa na lista: " + lista.indexOf("Larissa") + "\n"); // Retorna posi�ao -1 se n�o existir na lista.
		
		for(int contador = 0; contador<lista.size(); contador++) {
			System.out.println("Nome: " + lista.get(contador));
		}
		
		System.out.println();
		
		List<String> resultado = lista.stream().filter(n -> n.charAt(0) == 'B').collect(Collectors.toList()); // Criando uma lista com tudo que come�ar com a letra 'B' da primeira lista.
		
		for(int contador = 0; contador<resultado.size(); contador++) {
			System.out.println("Nome: " + resultado.get(contador));
		}
		
		String localizar = lista.stream().filter(n -> n.charAt(0) == 'B').findFirst().orElse(null); // Localiza dentro de lista o primeiro local que contem 'B'
		System.out.println();
		System.out.println("Primeiro local que contem 'B': " + localizar);
		
		
		/*
		for(String listinha: lista) {
			System.out.println(listinha);
		}
		*/
		
		tec.close();
	}

}
