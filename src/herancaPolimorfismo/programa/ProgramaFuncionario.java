package herancaPolimorfismo.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import herancaPolimorfismo.entidades.Funcionario;
import herancaPolimorfismo.entidades.FuncionarioTerceirizado;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Favor informar a quantidade de funcionarios a ser cadastrados: ");
		int quantidade = tec.nextInt();

		List<Funcionario> funcionarios = new ArrayList<>();
		
		for(int i=1; i<=quantidade; i++) {
			System.out.printf("O %dº funcionario é Interno(1) ou Terceirizado(2)?  ", i);
			int escolha = tec.nextInt();
			
			if(escolha == 1) {
				tec.nextLine();
				System.out.print("Digite o nome do funcionario: ");
				String nome = tec.nextLine();
				
				System.out.print("Quantas horas ele trabalhou? ");
				int horasTrabalhadas = tec.nextInt();
				
				System.out.print("Qual o valor da hora do funcionario? ");
				double valorHora = tec.nextDouble();
				
				Funcionario func = new Funcionario(nome, horasTrabalhadas, valorHora);
				funcionarios.add(func);
			}
			
			if(escolha == 2) {
				tec.nextLine();
				System.out.print("Digite o nome do funcionario: ");
				String nome = tec.nextLine();
				
				System.out.print("Quantas horas ele trabalhou? ");
				int horasTrabalhadas = tec.nextInt();
				
				System.out.print("Qual o valor da hora do funcionario? ");
				double valorHora = tec.nextDouble();
				
				System.out.print("Qual valor adicional do funcionario? ");
				double valorAdicional = tec.nextDouble();
				
				Funcionario func = new FuncionarioTerceirizado(nome, horasTrabalhadas, valorHora, valorAdicional);
				funcionarios.add(func);	
			}
			
		}
		System.out.println();
		System.out.println();
		for(Funcionario func: funcionarios) {
			System.out.println("Nome: " + func.getNome() + " Pagamento: " + func.pagamento());
		}
		
		tec.close();
	}

}
