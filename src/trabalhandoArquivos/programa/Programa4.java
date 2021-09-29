package trabalhandoArquivos.programa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa4 {

	public static void main(String[] args) {

		String[] linhas = new String[] { "Ol�, Mundo!", "Ol�, Gal�xia!", "Ol�, Universo!" };

		String caminho = "D:\\Downloads\\Programa��o\\Java\\Projetos Eclipse\\GitHub\\src\\trabalhandoArquivos\\testando.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {//new FileWriter(caminho, true) ir� adicionar no arquivo, caso j� exista, sem o true ele ir� substituir tudo pelo informado.

			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
