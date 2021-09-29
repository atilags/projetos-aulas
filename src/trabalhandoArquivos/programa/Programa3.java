package trabalhandoArquivos.programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa3 {

	public static void main(String[] args) {
		String caminho = "D:\\Downloads\\Programação\\Java\\Projetos Eclipse\\GitHub\\src\\trabalhandoArquivos\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

			String linha = br.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine(); // Irá ler a proxima linha do arquivo
			}
		} catch (IOException e) {
			System.out.println("Erro gerado: " + e.getMessage());
		}

	}
}
