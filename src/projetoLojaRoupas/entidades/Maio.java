package projetoLojaRoupas.entidades;

public class Maio extends Roupas{
	
	private Double preco;
	private final String nome = "Maiô";
	
	public Maio(String tamanho, String cor, Double preco) {
		super(tamanho, cor);
		this.preco = preco;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
}
