package enumeracaoComposicao.entidades;

import java.util.Date;

public class ContratoPorHora {
	
	private Date data;
	private Double valorPorHora;
	private Integer horasTrabalhadas;
	
	public ContratoPorHora(Date data, Double valorPorHora, Integer horasTrabalhadas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double valorTotal() {
		return valorPorHora * horasTrabalhadas;
	}
}
