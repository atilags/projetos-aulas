package projetoLojaMetais.entidades;

import java.util.Scanner;

public class Pedras {
	
	Scanner tec = new Scanner(System.in);

	private Double Turmalina = 29.0;
	private Double Ametista = 35.25;
	private Double Esmeralda = 29.38;
	private Double Jade = 37.12;
	private Double Rubi = 42.41;
	private Double Safira = 41.39;
	private Double Diamante = 68.52;
	private Double Opala = 52.23;
	private Double Turquesa = 35.0;
	
	public Pedras() {
	}

	public Double getTurmalina() {
		return Turmalina;
	}

	public void setTurmalina(Double turmalina) {
		Turmalina = turmalina;
	}

	public Double getAmetista() {
		return Ametista;
	}

	public void setAmetista(Double ametista) {
		Ametista = ametista;
	}

	public Double getEsmeralda() {
		return Esmeralda;
	}

	public void setEsmeralda(Double esmeralda) {
		Esmeralda = esmeralda;
	}

	public Double getJade() {
		return Jade;
	}

	public void setJade(Double jade) {
		Jade = jade;
	}

	public Double getRubi() {
		return Rubi;
	}

	public void setRubi(Double rubi) {
		Rubi = rubi;
	}

	public Double getSafira() {
		return Safira;
	}

	public void setSafira(Double safira) {
		Safira = safira;
	}

	public Double getDiamante() {
		return Diamante;
	}

	public void setDiamante(Double diamante) {
		Diamante = diamante;
	}

	public Double getOpala() {
		return Opala;
	}

	public void setOpala(Double opala) {
		Opala = opala;
	}

	public Double getTurquesa() {
		return Turquesa;
	}

	public void setTurquesa(Double turquesa) {
		Turquesa = turquesa;
	}
	
	public Double informarPreco(String nomePedra) {
		Double resultado = 0.0;
		if(nomePedra.equals("Turmalina")) {
			resultado = Turmalina;
		} else if(nomePedra.equals("Ametista")) {
			resultado = Ametista;
		} else if(nomePedra.equals("Esmeralda")) {
			resultado = Esmeralda;
		} else if(nomePedra.equals("Jade")) {
			resultado = Jade;
		} else if(nomePedra.equals("Rubi")) {
			resultado = Rubi;
		} else if(nomePedra.equals("Safira")) {
			resultado = Safira;
		} else if(nomePedra.equals("Diamante")) {
			resultado = Diamante;
		} else if(nomePedra.equals("Opala")) {
			resultado = Opala;
		} else if(nomePedra.equals("Turquesa")) {
			resultado = Turquesa;
		}
		
		return resultado;
	}
	
	public double calculoPreco(int cm, double preco) {
		return (preco * cm) / 2;
	}
	
	public void switchAlterarPreco(int escolha) {
		
		switch (escolha) {
		case 1:
			System.out.print("Preço da Turmalina: " + getTurmalina());
			System.out.println();
			System.out.print("Digite o novo preço da Turmalina: ");
			setTurmalina(tec.nextDouble());
			break;
		case 2:
			System.out.print("Preço da Ametista: " + getAmetista());
			System.out.println();
			System.out.print("Digite o novo preço da Ametista: ");
			setAmetista(tec.nextDouble());
			break;
		case 3:
			System.out.print("Preço da Esmeralda: " + getEsmeralda());
			System.out.println();
			System.out.print("Digite o novo preço da Esmeralda: ");
			setEsmeralda(tec.nextDouble());
			break;
		case 4:
			System.out.print("Preço da Jade: " + getJade());
			System.out.println();
			System.out.print("Digite o novo preço da Jade: ");
			setJade(tec.nextDouble());
			break;
		case 5:
			System.out.print("Preço do Rubi: " + getRubi());
			System.out.println();
			System.out.print("Digite o novo preço da Rubi: ");
			setRubi(tec.nextDouble());
			break;
		case 6:
			System.out.print("Preço da Safira: " + getSafira());
			System.out.println();
			System.out.print("Digite o novo preço da Safira: ");
			setSafira(tec.nextDouble());
			break;
		case 7:
			System.out.print("Preço do Diamante" + getDiamante());
			System.out.println();
			System.out.print("Digite o novo preço da Diamante: ");
			setDiamante(tec.nextDouble());
			break;
		case 8:
			System.out.print("Preço do Opala: " + getOpala());
			System.out.println();
			System.out.print("Digite o novo preço do Opala: ");
			setOpala(tec.nextDouble());
			break;
		case 9:
			System.out.print("Preço da Turquesa: " + getTurquesa());
			System.out.println();
			System.out.print("Digite o novo preço da Turquesa: ");
			setTurquesa(tec.nextDouble());
			break;
		default:
			System.out.println("Opção não reconhecida.");
		}
	}
	
}
