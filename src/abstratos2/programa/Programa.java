package abstratos2.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import abstratos2.entidades.Pessoa;
import abstratos2.entidades.PessoaFisica;
import abstratos2.entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.print("Informe quantas pessoas serão calculadas: ");
		int quant = tec.nextInt();
		
		for(int i = 0; i<quant; i++) {
			tec.nextLine();
			System.out.print("Favor informe o nome da pessoa: ");
			String nome = tec.nextLine();
			
			System.out.print("Informe a renda anual: ");
			Double rendaAnual = tec.nextDouble();
			
			tec.nextLine();
			System.out.print("É uma pessoa Fisica ou Juridica? F/J ");
			String escolha = tec.nextLine().toUpperCase().substring(0,1);
			
			if(escolha.equals("F")) {
				System.out.print("Informe o gasto com saúde: ");
				Double gastoSaude = tec.nextDouble();
				
				pessoas.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			}
			
			if(escolha.equals("J")) {
				System.out.print("Informe a quantidade de funcionarios: ");
				Integer numFuncionarios = tec.nextInt();
				
				pessoas.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
			}
		}
		
		Double total = 0.0;
		for(Pessoa lista: pessoas) {
			System.out.println("Nome: " + lista.getNome() + "Imposto: " + String.format("%.2f", lista.imposto()));
			total += lista.imposto();
		}
		
		System.out.println("Imposto total recebido: " + String.format("%.2f", total));
		
		tec.close();
	}

}
