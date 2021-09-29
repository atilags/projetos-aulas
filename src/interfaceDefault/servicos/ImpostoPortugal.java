package interfaceDefault.servicos;

public class ImpostoPortugal implements ServicoImposto{
	
	private Double imposto;
	
	public ImpostoPortugal(Double imposto) {
		this.imposto = imposto;
	}

	@Override
	public Double getImposto() {
		return imposto;
	}

}
