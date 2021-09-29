package lambda.utilitarios;

import java.util.List;
import java.util.function.Predicate;

import lambda.entidades.ProdutoPredicate;

public class Somatoria {
	
	public double filtragemSoma(List<ProdutoPredicate> l, Predicate<ProdutoPredicate> criterio) {
		double soma = 0;
		
		for(ProdutoPredicate p: l) {
			if(criterio.test(p)) {
				soma += p.getPrice();
			}
		}
		
		return soma;
	}


}