package projetoLojaMetais.entidades;

public class Metais {
	
	private final Double Aluminio = 26.58;
	private final Double Chumbo = 19.90;
	private final Double Cobre = 15.0;
	private final Double Estanho = 20.21;
	private final Double Niquel = 26.65;
	private final Double Ouro = 56.86;
	private final Double Paladio = 32.56;
	private final Double Platina = 53.32;
	private final Double Prata = 29.32;
	private final Double Zinco = 12.0;
	
	public Metais() {
	}

	public Double getAluminio() {
		return Aluminio;
	}

	public Double getChumbo() {
		return Chumbo;
	}

	public Double getCobre() {
		return Cobre;
	}

	public Double getEstanho() {
		return Estanho;
	}

	public Double getNiquel() {
		return Niquel;
	}

	public Double getOuro() {
		return Ouro;
	}

	public Double getPaladio() {
		return Paladio;
	}

	public Double getPlatina() {
		return Platina;
	}

	public Double getPrata() {
		return Prata;
	}

	public Double getZinco() {
		return Zinco;
	}
	
	public Double informarPreco(String nomePedra) {
		Double resultado = 0.0;
		if(nomePedra.equals("Aluminio")) {
			resultado = Aluminio;
		} else if(nomePedra.equals("Chumbo")) {
			resultado = Chumbo;
		} else if(nomePedra.equals("Cobre")) {
			resultado = Cobre;
		} else if(nomePedra.equals("Estanho")) {
			resultado = Estanho;
		} else if(nomePedra.equals("Niquel")) {
			resultado = Niquel;
		} else if(nomePedra.equals("Ouro")) {
			resultado = Ouro;
		} else if(nomePedra.equals("Paladio")) {
			resultado = Paladio;
		} else if(nomePedra.equals("Platina")) {
			resultado = Platina;
		} else if(nomePedra.equals("Prata")) {
			resultado = Prata;
		} else if(nomePedra.equals("Zinco")) {
			resultado = Zinco;
		}
		
		return resultado;
	}
	
	public double calculoPreco(int quilo, double preco) {
		return (preco * quilo) / 1000;
		// Regra de 3, Preço total * peso comprado, dividido por 1000, isso dará o valor a pagar.
	}
	
}
