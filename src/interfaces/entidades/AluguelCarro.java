package interfaces.entidades;

import java.util.Date;

public class AluguelCarro {
	
	private Date inicial;
	private Date termino;
	
	private Veiculo veiculo;
	private NotaFiscal notaFiscal;
	
	public AluguelCarro() {
	}

	public AluguelCarro(Date inicial, Date termino, Veiculo veiculo) {
		this.inicial = inicial;
		this.termino = termino;
		this.veiculo = veiculo;
	}

	public Date getInicial() {
		return inicial;
	}

	public void setInicial(Date inicial) {
		this.inicial = inicial;
	}

	public Date getTermino() {
		return termino;
	}

	public void setTermino(Date termino) {
		this.termino = termino;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
}
