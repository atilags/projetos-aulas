package projetoLojaRoupas.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import projetoLojaRoupas.entidades.Biquini;
import projetoLojaRoupas.entidades.Maio;
import projetoLojaRoupas.entidades.Vestido;
import projetoLojaRoupas.entidades.Blusa;
import projetoLojaRoupas.entidades.Vendas;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		List<Integer> tipo = new ArrayList<>();
		
		System.out.print("Informe o CPF do comprador: ");
		Double cpf = tec.nextDouble();
		
		Vendas venda = new Vendas(cpf);
		
		String resposta = "s";
		do {
			System.out.print("- Escolha uma opção, pelo que foi comprado -");
			System.out.println();
			System.out.println("1 - Biquini");
			System.out.println("2 - Maiô");
			System.out.println("3 - Vestido");
			System.out.println("4 - Blusa");
			int escolha = tec.nextInt();
			tec.nextLine();
			
			switch (escolha) {
			case 1:
				tipo.add(1);
				System.out.print("Qual o tamanho da roupa? P/M/G/GG ");
				String tamanho1 = tec.nextLine().toUpperCase();
				
				System.out.print("Qual a cor do Biquini? ");
				String cor1 = tec.nextLine();
				
				System.out.print("Informe o preço: ");
				Double preco1 = tec.nextDouble();
				
				venda.addCompras(new Biquini(tamanho1, cor1, preco1));
				break;
			case 2:
				tipo.add(2);
				System.out.print("Qual o tamanho da roupa? P/M/G/GG ");
				String tamanho2 = tec.nextLine().toUpperCase();
				
				System.out.print("Qual a cor do Maiô? ");
				String cor2 = tec.nextLine();
				
				System.out.print("Informe o preço: ");
				Double preco2 = tec.nextDouble();
				
				venda.addCompras(new Maio(tamanho2, cor2, preco2));
				break;
			case 3:
				tipo.add(3);
				System.out.print("Qual o tamanho da roupa? P/M/G/GG ");
				String tamanho3 = tec.nextLine().toUpperCase();
				
				System.out.print("Qual a cor do Vestido? ");
				String cor3 = tec.nextLine();
				
				System.out.print("Informe o preço: ");
				Double preco3 = tec.nextDouble();
				
				venda.addCompras(new Vestido(tamanho3, cor3, preco3));
				break;
			case 4:
				tipo.add(4);
				System.out.print("Qual o tamanho da roupa? P/M/G/GG ");
				String tamanho4 = tec.nextLine().toUpperCase();
				
				System.out.print("Qual a cor da Blusa? ");
				String cor4 = tec.nextLine();
				
				System.out.print("Informe o preço: ");
				Double preco4 = tec.nextDouble();
				
				venda.addCompras(new Blusa(tamanho4, cor4, preco4));
				break;
			default:
				System.out.println("Opção não reconhecida.");
			}
			
			System.out.print("Inserir mais compras? S/N ");
			resposta = tec.next().toLowerCase().substring(0, 1);
			
		} while(resposta.equals("s")); 
		
		System.out.println();
		
		Double soma = 0.0;
		for(int i = 0; i<tipo.size(); i++) {
			
			if(tipo.get(i) == 1) {
				System.out.println(venda.biquini(i));
				soma += venda.biquiniPreco(i);
			}else if(tipo.get(i) == 2) {
				System.out.println(venda.maio(i));
				soma += venda.maioPreco(i);
			}else if(tipo.get(i) == 3) {
				System.out.println(venda.vestido(i));
				soma += venda.vestidoPreco(i);
			}else if(tipo.get(i) == 4) {
				System.out.println(venda.blusa(i));
				soma += venda.blusaPreco(i);
			}
		}
		
		System.out.println("Preço total: R$" + soma);
		
		tec.close();
	}

}
