package interfaceDefault.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

import interfaceDefault.servicos.ServicoImposto;

public class Compra {
	
	private Double valor;
	private Integer parcelas;
	private Date dataCompra;
	
	private ServicoImposto imposto;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Compra(Double valor, Integer parcelas, Date dataCompra) {
		this.valor = valor;
		this.parcelas = parcelas;
		this.dataCompra = dataCompra;
	}

	public Double getValor() {
		return valor;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public String getDataCompra() {
		return sdf.format(dataCompra);
	}

	public Double getImposto() {
		return imposto.calculoPagamento(valor, parcelas);
	}

	public void setImposto(ServicoImposto imposto) {
		this.imposto = imposto;
	}
	
}
