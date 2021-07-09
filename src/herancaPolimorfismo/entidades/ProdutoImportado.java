package herancaPolimorfismo.entidades;

public final class ProdutoImportado extends Produto{
	
	private Double taxaImposto;
	
	public ProdutoImportado(String nome, Double preco, Double taxaImposto) {
		super(nome, preco);
		this.taxaImposto = taxaImposto;
	}

	public Double getTaxaImposto() {
		return taxaImposto;
	}

	public void setTaxaImposto(Double taxaImposto) {
		this.taxaImposto = taxaImposto;
	}
	
	@Override
	public String etiqueta() {
		return "Produto: " + nome + "\nPreço: " + String.format("%.2f", precoTotal()) + "\nImposto: " + taxaImposto;
	}
	
	public Double precoTotal() {
		return preco+taxaImposto;
	}

}