package abstratos2.entidades;

public class PessoaJuridica extends Pessoa{
	
	private Integer numFuncionarios;

	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	
	@Override
	public Double imposto() {
		Double pagar = 0.0;
		
		if(numFuncionarios>10) {
			pagar = rendaAnual*0.14;
		}else {
			pagar = rendaAnual*0.16;
		}
		
		return pagar;
	}
}
