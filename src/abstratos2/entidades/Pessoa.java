package abstratos2.entidades;

public abstract class Pessoa {
	
	protected String nome;
	protected Double rendaAnual;
	
	public Pessoa(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Double rendaAnual() {
		return rendaAnual;
	}
	
	public abstract Double imposto();
}
