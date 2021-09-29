package interfaceDefault.programa;

import java.security.InvalidParameterException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import interfaceDefault.entidades.Compra;
import interfaceDefault.servicos.ImpostoBrasil;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		try (Scanner tec = new Scanner(System.in)){
			
			System.out.print("Informe o valor do pedido: ");
			Double valor = tec.nextDouble();
			
			System.out.print("Informe a quantidade de meses para se parcelar: ");
			Integer mes = tec.nextInt();
			
			Compra compra = new Compra(valor, mes, new Date());
			
			System.out.println("Sua compra foi realizada na data e hora: " + compra.getDataCompra());
			
			System.out.print("Qual o valor do imposto? ");
			Double imposto = tec.nextDouble();
			
			compra.setImposto(new ImpostoBrasil(imposto));
			
			System.out.println("Valor final: " + String.format("%.2f", compra.getImposto()));
			
			
		} catch (InvalidParameterException e){
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
