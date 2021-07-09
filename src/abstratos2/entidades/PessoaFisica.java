package abstratos2.entidades;

public class PessoaFisica extends Pessoa {
	
	private Double gastoSaude;
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public Double imposto() {
		Double pagar = 0.0;
		
		if(rendaAnual<20000) {
			pagar = rendaAnual*0.15;
		}
		
		if(rendaAnual>20000) {
			pagar = rendaAnual*0.25;
		}
		
		pagar -= (gastoSaude*0.50);
		
		return pagar;
	}
}
