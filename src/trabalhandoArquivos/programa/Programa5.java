package trabalhandoArquivos.programa;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

/*
 * Esse c�digo est� trabalhando pastas.
 */

public class Programa5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		//System.out.print("Digite o caminho de uma pasta: ");
		//String caminho = tec.nextLine();
		
		String caminho = "D:\\Downloads\\Programa��o\\Java";
		
		File pasta = new File(caminho);
		//File pasta = new File("D:\\Downloads\\Programa��o\\Java");
		
		File[] pastas = pasta.listFiles(File::isDirectory);
		
		for(int i=0; i<pastas.length; i++) {
			System.out.println((i+1) + "� Pasta: " + pastas[i]);
		}
		
		System.out.println();
		
		File[] arquivos = pasta.listFiles(File::isFile);
		
		for(int i=0; i<arquivos.length; i++) {
			System.out.println((i+1) + "� Arquivo: " + arquivos[i]);
		}
		
		// Cria��o de pasta
		
		boolean verdadeiro = new File(pasta + "\\Cria��o Teste").mkdir();
		System.out.println("O diretorio foi criado: " + verdadeiro);
		
		tec.close();
	}

}
