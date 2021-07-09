package projetoLojaRoupas.entidades;

import java.util.ArrayList;
import java.util.List;

public class Vendas {
	
	private Double cpf;
	private List<Roupas> compras = new ArrayList<>();
	
	public Vendas() {
		
	}
	
	public Vendas(Double cpf) {
		this.cpf = cpf;
	}
	
	public double getCpf() {
		return cpf;
	}
	
	public List<Roupas> getCompras() {
		return compras;
	}

	public void addCompras(Roupas compra) {
		compras.add(compra);
	}
	
	public String biquini(int i) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Produto: " + ((Biquini)compras.get(i)).getNome() + " ");
		sb.append(((Biquini)compras.get(i)).getCor() + " ");
		sb.append(((Biquini)compras.get(i)).getTamanho() + " - ");
		sb.append("Preço unitario: R$" + ((Biquini)compras.get(i)).getPreco());
		
		return sb.toString();
	}
	
	public Double biquiniPreco(int i) {
		return ((Biquini)compras.get(i)).getPreco();
	}
	
	public String maio(int i) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Produto: " + ((Maio)compras.get(i)).getNome() + " ");
		sb.append(((Maio)compras.get(i)).getCor() + " ");
		sb.append(((Maio)compras.get(i)).getTamanho() + " - ");
		sb.append("Preço unitario: " + ((Maio)compras.get(i)).getPreco());
		
		return sb.toString();
	}
	
	public Double maioPreco(int i) {
		return ((Maio)compras.get(i)).getPreco();
	}
	
	public String vestido(int i) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Produto: " + ((Vestido)compras.get(i)).getNome() + " ");
		sb.append(((Vestido)compras.get(i)).getCor() + " ");
		sb.append(((Vestido)compras.get(i)).getTamanho() + " - ");
		sb.append("Preço unitario: " + ((Vestido)compras.get(i)).getPreco());
		
		return sb.toString();
	}
	
	public Double vestidoPreco(int i) {
		return ((Vestido)compras.get(i)).getPreco();
	}
	
	public String blusa(int i) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Produto: " + ((Blusa)compras.get(i)).getNome() + " ");
		sb.append(((Blusa)compras.get(i)).getCor() + " ");
		sb.append(((Blusa)compras.get(i)).getTamanho() + " - ");
		sb.append("Preço unitario: " + ((Blusa)compras.get(i)).getPreco());
		
		return sb.toString();
	}
	
	public Double blusaPreco(int i) {
		return ((Blusa)compras.get(i)).getPreco();
	}
}
