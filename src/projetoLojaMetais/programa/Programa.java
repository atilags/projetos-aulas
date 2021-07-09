package projetoLojaMetais.programa;

import java.util.Locale;
import java.util.Scanner;

import projetoLojaMetais.entidades.Cliente;
import projetoLojaMetais.entidades.Pedras;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);

		Pedras pedras = new Pedras();
		Cliente cliente = new Cliente();
		
		System.out.print("Bem vindo, deseja alterar o valor de alguma das pedras preciosas? s/n ");
		String resposta = tec.nextLine().toLowerCase();

		while (resposta.equals("sim") || resposta.equals("s")) {
			System.out.println("1 - Turmalina");
			System.out.println("2 - Ametista");
			System.out.println("3 - Esmeralda");
			System.out.println("4 - Jade");
			System.out.println("5 - Rubi");
			System.out.println("6 - Safira");
			System.out.println("7 - Diamante");
			System.out.println("8 - Opala");
			System.out.println("9 - Turquesa");

			System.out.print("Qual a pedra que deseja alterar o preço? ");
			int escolha = tec.nextInt();
			
			pedras.switchAlterarPreco(escolha);
			
			tec.nextLine();
			System.out.print("Deseja modificar uma nova pedra? ");
			resposta = tec.nextLine();
		}

		resposta = "sim";

		while (resposta.equals("sim") || resposta.equals("s")) {
			System.out.print("O que o cliente deseja comprar? Metal/Pedra ");
			String escolha = tec.nextLine().toLowerCase();

			if (escolha.equals("metal") || escolha.equals("metais")) {
				System.out.println("1 - Aluminio");
				System.out.println("2 - Chumbo");
				System.out.println("3 - Cobre");
				System.out.println("4 - Estanho");
				System.out.println("5 - Niquel");
				System.out.println("6 - Ouro");
				System.out.println("7 - Paladio");
				System.out.println("8 - Platina");
				System.out.println("9 - Prata");
				System.out.println("10 - Zinco");
				
				System.out.print("Escolha o metal que foi vendido: ");
				int compraMetal = tec.nextInt();
				
				if(compraMetal >= 1 && compraMetal <=10) {
					cliente.addCompraMetal(compraMetal);
					System.out.print("Informe as gramas: ");
					int quantGramas = tec.nextInt();
					cliente.addQuantidadeMetal(quantGramas);
					tec.nextLine();
				}else {
					System.out.print("Opção não reconhecida.");
				}
				
				
			} else if (escolha.equals("pedra") || escolha.equals("pedras")) {
				System.out.println("1 - Turmalina");
				System.out.println("2 - Ametista");
				System.out.println("3 - Esmeralda");
				System.out.println("4 - Jade");
				System.out.println("5 - Rubi");
				System.out.println("6 - Safira");
				System.out.println("7 - Diamante");
				System.out.println("8 - Opala");
				System.out.println("9 - Turquesa");
				
				System.out.print("Escolha a pedra que foi vendida: ");
				int compraPedra = tec.nextInt();
				
				if(compraPedra >= 1 && compraPedra <=9) {
					cliente.addCompraPedra(compraPedra);
					System.out.print("Informe quantos centimetros 1/2: ");
					Integer centimetros = tec.nextInt();
					cliente.addQuantidadePedra(centimetros);
					tec.nextLine();
				}else {
					System.out.print("Opção não reconhecida.");
				}

			}else {
				System.out.println("Opção não reconhecida.");
			}
			
			System.out.print("Deseja realizar uma nova compra? Sim/Não ");
			resposta = tec.nextLine().toLowerCase();
		}
		
		System.out.print("Qual o CPF do comprador? ");
		long cpf = tec.nextLong();
		cliente.setCpf(cpf);
		
		System.out.print("Qual a forma de pagamento? Dinheiro/Outros ");
		tec.nextLine();
		String formaPag = tec.nextLine().toLowerCase();
		cliente.setFormaPagamento(formaPag);
		cliente.calculoValorFinal(pedras);
		//Nota Fiscal
		
		System.out.println();
		System.out.print("Cpf do cliente: " + cliente.getCpf());
		System.out.println();
		cliente.comprasFeitas();
		System.out.println();
		if(cliente.getFormaPagamento().equals("dinheiro")) {
			System.out.print("Valor total: " + String.format("%.2f", cliente.getValorFinal()));
			System.out.println();
			System.out.print("Valor com desconto: " + String.format("%.2f", (cliente.getValorFinal() - (cliente.getValorFinal() * 0.1))));
			System.out.println();
		}else {
			System.out.print("Valor total: " + String.format("%.2f", cliente.getValorFinal()));
			System.out.println();
		}
		System.out.print("Forma de pagamento: " + cliente.getFormaPagamento());
		
		tec.close();
	}

}
