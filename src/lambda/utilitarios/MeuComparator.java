package lambda.utilitarios;

import java.util.Comparator;

import lambda.entidades.ProdutoComparator;

public class MeuComparator implements Comparator<ProdutoComparator> {

	@Override
	public int compare(ProdutoComparator p1, ProdutoComparator p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
}