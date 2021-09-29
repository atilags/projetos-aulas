package trabalhandoArquivos.programa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa4 {

	public static void main(String[] args) {

		String[] linhas = new String[] { "Olá, Mundo!", "Olá, Galáxia!", "Olá, Universo!" };

		String caminho = "D:\\Downloads\\Programação\\Java\\Projetos Eclipse\\GitHub\\src\\trabalhandoArquivos\\testando.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {//new FileWriter(caminho, true) irá adicionar no arquivo, caso já exista, sem o true ele irá substituir tudo pelo informado.

			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
