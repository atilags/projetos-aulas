package interfaces.servicos;

import interfaces.entidades.AluguelCarro;
import interfaces.entidades.NotaFiscal;

public class ServicosAluguel {
	
	private Double precoHora;
	private Double precoDia ;
	
	private ServicoTaxa imposto;
	
	public ServicosAluguel() {
	}

	public ServicosAluguel(Double precoHora, Double precoDia, ServicoTaxa imposto) {
		this.precoHora = precoHora;
		this.precoDia = precoDia;
		this.imposto = imposto;
	}
	
	public void processandoNotaFiscal(AluguelCarro aluguelCarro) {
		
		long entrada = aluguelCarro.getInicial().getTime();
		long termino = aluguelCarro.getTermino().getTime();
		double horas = (double)(termino-entrada) / 1000 / 60 / 60;
		
		double pagamentoBase;
		
		if (horas <= 12.0) {
			pagamentoBase = Math.ceil(horas) * precoHora;
		} else {
			pagamentoBase = Math.ceil(horas/24) * precoDia;
		}
		
		double taxa = imposto.imposto(pagamentoBase);
		
		aluguelCarro.setNotaFiscal(new NotaFiscal(pagamentoBase, taxa));
		
	}
}
