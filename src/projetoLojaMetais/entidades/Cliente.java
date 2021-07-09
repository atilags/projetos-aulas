package projetoLojaMetais.entidades;

public class Cliente {

	private Long cpf;
	private String formaPagamento;
	private Double valorFinal;

	private String[] compraMetal = new String[200]; // Aqui guarda o nome do metal
	private Integer[] quantidadeMetal = new Integer[200]; // Quantidade comprada de metal em gramas.
	private String[] compraPedra = new String[200]; // Aqui guarda o nome da Pedra
	private Integer[] quantidadePedra = new Integer[200]; // Quantidade comprada de Pedras, 1 ou 2 cm.

	public Cliente() {
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Double getValorFinal() {
		return valorFinal;
	}

	public void addCompraMetal(int compraMetal) {
		String metal = "";

		if (compraMetal == 1) {
			metal = "Aluminio";
		} else if (compraMetal == 2) {
			metal = "Chumbo";
		} else if (compraMetal == 3) {
			metal = "Cobre";
		} else if (compraMetal == 4) {
			metal = "Estanho";
		} else if (compraMetal == 5) {
			metal = "Niquel";
		} else if (compraMetal == 6) {
			metal = "Ouro";
		} else if (compraMetal == 7) {
			metal = "Paladio";
		} else if (compraMetal == 8) {
			metal = "Platina";
		} else if (compraMetal == 9) {
			metal = "Prata";
		} else if (compraMetal == 10) {
			metal = "Zinco";
		}

		for (int i = 0; i < 200; i++) {
			if (this.compraMetal[i] == null) {
				this.compraMetal[i] = metal;
				break;
			}
		}
	}

	public void addQuantidadeMetal(Integer quantGramas) {
		for (int i = 0; i < 200; i++) {
			if (quantidadeMetal[i] == null) {
				this.quantidadeMetal[i] = quantGramas;
				break;
			}
		}
	}

	public void addCompraPedra(int compraPedra) {
		String pedra = "";

		if (compraPedra == 1) {
			pedra = "Turmalina";
		} else if (compraPedra == 2) {
			pedra = "Ametista";
		} else if (compraPedra == 3) {
			pedra = "Esmeralda";
		} else if (compraPedra == 4) {
			pedra = "Jade";
		} else if (compraPedra == 5) {
			pedra = "Rubi";
		} else if (compraPedra == 6) {
			pedra = "Safira";
		} else if (compraPedra == 7) {
			pedra = "Diamante";
		} else if (compraPedra == 8) {
			pedra = "Opala";
		} else if (compraPedra == 9) {
			pedra = "Turquesa";
		}

		for (int i = 0; i < 200; i++) {
			if (this.compraPedra[i] == null) {
				this.compraPedra[i] = pedra;
				break;
			}
		}
	}

	public void addQuantidadePedra(Integer quantidadePedra) {
		for (int i = 0; i < 200; i++) {
			if (this.quantidadePedra[i] == null) {
				this.quantidadePedra[i] = quantidadePedra;
				break;
			}
		}
	}

	public void calculoValorFinal(Pedras pedras) {
		double soma = 0;
		double preco = 0;
		Metais metais = new Metais();
		
		int contador1 = 0;
		int contador2 = 0;

		for (Integer qM : quantidadeMetal) {
			if (qM != null) {
				preco = metais.informarPreco(compraMetal[contador1]);
				soma += metais.calculoPreco(qM, preco);
				contador1++;
			}
		}

		for (Integer qP : quantidadePedra) {
			if (qP != null) {
				preco = pedras.informarPreco(compraPedra[contador2]);
				soma += pedras.calculoPreco(qP, preco);
				contador2++;
			}
		}

		valorFinal = soma;
	}
	
	public void comprasFeitas() {
		Metais metais = new Metais();
		Pedras pedras = new Pedras();
		
		for(int i = 0; i < 200; i++) {
			if(compraMetal[i] != null) {
				double preco = 0;
				preco = metais.informarPreco(compraMetal[i]);
				System.out.print(quantidadeMetal[i] + " Gramas de " + compraMetal[i] + " R$ " + String.format("%.2f", metais.calculoPreco(quantidadeMetal[i], preco)) + "\n");
			}
		}
		
		for(int i = 0; i < 200; i++) {
			if(compraPedra[i] != null) {
				double preco = 0;
				preco = pedras.informarPreco(compraPedra[i]);
				System.out.print(quantidadePedra[i] + " Centimetros de " + compraPedra[i] + " R$ " + String.format("%.2f", pedras.calculoPreco(quantidadePedra[i], preco)) + "\n");
			}
		}
	}
}
