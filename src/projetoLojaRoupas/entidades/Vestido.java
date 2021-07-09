package projetoLojaRoupas.entidades;

public class Vestido extends Roupas{
	
	private Double preco;
	private final String nome = "Vestido";
	
	public Vestido(String tamanho, String cor, Double preco) {
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
