package interfaceDefault.servicos;

import java.security.InvalidParameterException;

public interface ServicoImposto {
	
	Double getImposto();
	
	default Double calculoPagamento(Double valor, Integer parcelas) {
		if(parcelas < 1) {
			throw new InvalidParameterException("Ao menos deve-se ter 1 mês no calculo do pagamento");
		} else {
			return valor * Math.pow(1.0 + getImposto() / 100, parcelas);
		}
	}

}
