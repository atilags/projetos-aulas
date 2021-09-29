package lambda.entidades;

public class Aluno {
	
	private String nome;
	private double avaliacaoP1;
	private double avaliacaoP2;
	
	
	public Aluno(String nome) {
		this.nome = nome;
	}	

	public double media() {
		return (avaliacaoP1 + avaliacaoP2) / 2;
	}
	
	public double getAvaliacaoP1() {
		return avaliacaoP1;
	}

	public void setAvaliacaoP1(double avaliacaoP1) {
		this.avaliacaoP1 = avaliacaoP1;
	}

	public double getAvaliacaoP2() {
		return avaliacaoP2;
	}

	public void setAvaliacaoP2(double avaliacaoP2) {
		this.avaliacaoP2 = avaliacaoP2;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	@Override
	public String toString() {
		return 			
				"Aluno ".toUpperCase() +
				String.format("\n[Nome: %s]", nome) +
				String.format("\n[Avaliacao P1: %.1f]", avaliacaoP1) +
				String.format("\n[Avaliacao P2: %.1f]", avaliacaoP2) +
				String.format("\n[Média: %.2f]", media());
	}
	
	
	
}
