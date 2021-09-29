package interfaceDefault.servicos;

public class ImpostoBrasil implements ServicoImposto{
	
	private Double imposto;
	
	public ImpostoBrasil(Double imposto) {
		this.imposto = imposto;
	}

	@Override
	public Double getImposto() {
		return imposto;
	}

}
