package herancaPolimorfismo.entidades;

public class FuncionarioTerceirizado extends Funcionario {
	
	private Double valorAdicional;
	
	public FuncionarioTerceirizado(String nome, Integer horasTrabalhadas, Double valorHora, Double valorAdicional) {
		super(nome, horasTrabalhadas, valorHora);
		this.valorAdicional = valorAdicional;
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public double pagamento() {
		//return (valorHora*horasTrabalhadas) + (valorAdicional*1.1);
		return super.pagamento() + (valorAdicional*1.1);
	}
}
