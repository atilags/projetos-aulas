package interfaces.programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import interfaces.entidades.AluguelCarro;
import interfaces.entidades.Veiculo;
import interfaces.servicos.ServicoTaxaBrasileira;
import interfaces.servicos.ServicosAluguel;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.print("Informe a marca do carro: ");
		String carro = tec.nextLine();
		System.out.print("Entre com a hora inicial do aluguel dd/MM/yyyy HH:ss: ");
		Date entrada = sdf.parse(tec.nextLine());
		System.out.print("Entre com a hora final do aluguel dd/MM/yyyy HH:ss: ");
		Date termino = sdf.parse(tec.nextLine());
		
		AluguelCarro aluguel = new AluguelCarro(entrada, termino, new Veiculo(carro));
		
		System.out.print("Informe o preço por hora: ");
		double precoHora = tec.nextDouble();
		System.out.print("Informe o preço por dia: ");
		double precoDia = tec.nextDouble();
		
		ServicosAluguel servico = new ServicosAluguel(precoHora, precoDia, new ServicoTaxaBrasileira());
		
		servico.processandoNotaFiscal(aluguel);
		
		System.out.println("Valor basico: " + aluguel.getNotaFiscal().getPagamentoBase());
		System.out.println("Valor do imposto: " + aluguel.getNotaFiscal().getImposto());
		System.out.println("Valor total: " + aluguel.getNotaFiscal().pagamentoTotal());
		
		tec.close();
		
	}

}
