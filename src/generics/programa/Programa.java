package generics.programa;

import java.util.Locale;
import java.util.Scanner;

import generics.entidades.Informacao;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner tec = new Scanner(System.in)) {

			System.out.println("A lista ser� String ou Double? S/D"); // Exemplos, somente.
			String escolha = tec.next().toLowerCase();

			if (escolha.equals("s")) {
				Informacao<String> lista = new Informacao<>();

				System.out.println("Quantas String ser�o inseridas?");
				int quantidade = tec.nextInt();
				tec.nextLine();

				for (int i = 0; i < quantidade; i++) {
					System.out.printf("Informe a %d� String: ", i + 1);
					String info = tec.nextLine();

					lista.addInformacoes(info);
				}
				
				System.out.println();
				
				for (int i = 0; i < quantidade; i++) {
					System.out.printf("A %d� String �: %s\n", i + 1, lista.toString(i));
				}

				System.out.println();
				System.out.println("Primeiro index: " + lista.primeiroIndex());

			} else if (escolha.equals("d")) {

				Informacao<Double> lista = new Informacao<>();

				System.out.println("Quantas String ser�o inseridas?");
				int quantidade = tec.nextInt();

				for (int i = 0; i < quantidade; i++) {
					System.out.printf("Informe o %d� Double: ", i + 1);
					Double info = tec.nextDouble();

					lista.addInformacoes(info);
				}
				
				System.out.println();

				for (int i = 0; i < quantidade; i++) {
					System.out.printf("O %d� Double �: %s\n", i + 1, lista.toString(i));
				}

				System.out.println();
				System.out.println("Primeiro index: " + lista.primeiroIndex());

			} else {
				System.out.println("Escolha digitada incorretamente, programa encerrado.");
			}

		} catch (IllegalStateException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
