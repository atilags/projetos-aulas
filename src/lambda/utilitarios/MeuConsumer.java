package lambda.utilitarios;

import java.util.function.Consumer;

import lambda.entidades.ProdutoConsumer;

public class MeuConsumer implements Consumer<ProdutoConsumer>{
	
	private Double valor;
	
	public MeuConsumer(Double valor) {
		super();
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public void accept(ProdutoConsumer p) {
		//p.setPrice((p.getPrice() * 0.1) + p.getPrice());
		//p.setPrice(p.getPrice() * 1.1);
		
		if(p.getPrice() >= valor) {
			p.setPrice(p.getPrice() * 1.1);
		}
	}

}
