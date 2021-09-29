package set.programa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Basico {

	public static void main(String[] args) {

		Set<String> listaSet1 = new HashSet<>(); // Set organizado de forma aleatoria. ( Rapido )
		Set<String> listaSet2 = new LinkedHashSet<>(); // Set organizado na ordem na qual foi inserido. ( Medio )
		Set<String> listaSet3 = new TreeSet<>(); // Set é organizado, por exemplo na ordem alfabetica.( Lento )
		
		listaSet1.add("TV");
		listaSet1.add("Tablet");
		listaSet1.add("Notebook");
		
		listaSet2.add("Armario");
		listaSet2.add("TV");
		listaSet2.add("Celular");
		
		listaSet3.add("Regua");
		listaSet3.add("Alicate");
		listaSet3.add("Copo");
		
		System.out.println(listaSet1.contains("Notebook")); // Irá imprimir em boolean se existe um "Notebook" dentro da listaSet1.
		System.out.println(listaSet1.contains("Computador"));
		//listaSet1.clear(); Serve para apagar tudo dentro do Set
		
		System.out.println(listaSet1.size()); // Diz a quantidade de index existente no Set
		
		//listaSet1.addAll(listaSet2); Adiciona a uma lista, tudo que contem em outra lista, porem não aceita itens repetidos.
		
		//listaSet1.retainAll(listaSet2); Retira de uma lista, tudo que NÃO existe em uma outra lista.
		//listaSet1.removeAll(listaSet2); Retira de uma lista, tudo que EXISTIR em uma outra lista.
		//listaSet1.removeIf(x -> x.charAt(0) == 'A'); Removeria do Set qualquer coisa começada por A, lembrando ser case sensitive.
		
		System.out.println();
		System.out.println("- HashSet -");
		for (String p : listaSet1) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("- LinkedHashSet -");
		for (String p : listaSet2) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("- TreeSet -");
		for (String p : listaSet3) {
			System.out.println(p);
		}
	}
}