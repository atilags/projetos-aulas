package enumeracaoComposicao.programa;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import enumeracaoComposicao.entidades.ContratoPorHora;
import enumeracaoComposicao.entidades.Departamento;
import enumeracaoComposicao.entidades.Trabalhador;
import enumeracaoComposicao.entidades.enums.NivelDoTrabalhador;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		//SimpleDateFormat formatoDataVerificacao = new SimpleDateFormat("MM/yyyy");

		
		System.out.print("Qual o nome do departamento? ");
		String departamento = tec.nextLine();
		
		System.out.println("-- Entre com os dados do funcionario abaixo --");
		
		System.out.print("Nome: ");
		String nome = tec.nextLine();
		
		System.out.print("Nivel do trabalhador? ");
		String level = tec.nextLine();
		
		System.out.print("Salario base: ");
		double salario = tec.nextDouble();
		
		Trabalhador cadastro = new Trabalhador(nome, NivelDoTrabalhador.valueOf(level), salario, new Departamento(departamento));
		
		System.out.print("Quantos contratos o funcionario possui? ");
		int quantidade = tec.nextInt();
		
		for(int contador = 0; contador<quantidade; contador++) {
			System.out.printf("De as informações abaixo do %dº contrato:\n", contador+1);
			System.out.print("Informe a data do contrato (dd/mm/aaaa): ");
			Date data = formatoData.parse(tec.next());
			
			System.out.print("Valor por hora: ");
			double valorPorHora = tec.nextDouble();
			
			System.out.print("Duração em horas: ");
			int duracao = tec.nextInt();
			
			ContratoPorHora contrato = new ContratoPorHora(data, valorPorHora, duracao);
			
			cadastro.adicionarContrato(contrato);
		}
		
		System.out.println();
		
		System.out.println("Informe o mês e ano que deseja verficiar o salario total (mm/aaaa): ");
		//Date pesquisa = formatoDataVerificacao.parse(tec.next());
		String mesAno = tec.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("Nome: " + cadastro.getNome());
		System.out.println("Departamento: " + cadastro.getDepartamento().getDepartamento());
		System.out.println("Nivel do trabalhador: " + cadastro.getNivel());
		System.out.println("Salario no mes e ano informado: " + String.format("%.2f", cadastro.salarioMes(ano, mes)));
		
		tec.close();
	}

}
