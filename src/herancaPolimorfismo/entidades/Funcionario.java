package herancaPolimorfismo.entidades;

public class Funcionario {
	
	protected String nome;
	protected Integer horasTrabalhadas;
	protected Double valorHora;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, Integer horasTrabalhadas, Double valorHora) {
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public double pagamento() {
		return valorHora * horasTrabalhadas;
	}
}
