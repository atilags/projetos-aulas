package trabalhandoArquivos.programa;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

/*
 * Esse código está trabalhando pastas.
 */

public class Programa5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		//System.out.print("Digite o caminho de uma pasta: ");
		//String caminho = tec.nextLine();
		
		String caminho = "D:\\Downloads\\Programação\\Java";
		
		File pasta = new File(caminho);
		//File pasta = new File("D:\\Downloads\\Programação\\Java");
		
		File[] pastas = pasta.listFiles(File::isDirectory);
		
		for(int i=0; i<pastas.length; i++) {
			System.out.println((i+1) + "º Pasta: " + pastas[i]);
		}
		
		System.out.println();
		
		File[] arquivos = pasta.listFiles(File::isFile);
		
		for(int i=0; i<arquivos.length; i++) {
			System.out.println((i+1) + "º Arquivo: " + arquivos[i]);
		}
		
		// Criação de pasta
		
		boolean verdadeiro = new File(pasta + "\\Criação Teste").mkdir();
		System.out.println("O diretorio foi criado: " + verdadeiro);
		
		tec.close();
	}

}
