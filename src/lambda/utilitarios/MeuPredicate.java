package lambda.utilitarios;

import java.util.function.Predicate;

import lambda.entidades.ProdutoPredicate;

public class MeuPredicate implements Predicate<ProdutoPredicate>{

	@Override
	public boolean test(ProdutoPredicate p) {
		return p.getPrice() >= 100.0;
	}

}
