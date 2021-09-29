package lambda.utilitarios;

import java.util.function.Function;

import lambda.entidades.ProdutoFunction;

public class MeuFunction implements Function<ProdutoFunction, String> {

	public String apply(ProdutoFunction p) {
		return p.getName().toUpperCase();
		//return p.getPrice() > 100.0 ? p.getName().toUpperCase() : "Preço baixo demais";
	}

}
