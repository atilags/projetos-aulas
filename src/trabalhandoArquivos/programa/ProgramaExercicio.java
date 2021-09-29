package trabalhandoArquivos.programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import trabalhandoArquivos.utilitarios.Produtos;

public class ProgramaExercicio {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);

		List<Produtos> produtos = new ArrayList<>();

		System.out.print("Informe o caminho do arquivo a ser lido: ");
		String strCaminho = tec.nextLine();

		File arquivoFonte = new File(strCaminho);
		String pastaFonteStr = arquivoFonte.getParent();

		@SuppressWarnings("unused")
		boolean verdadeiro = new File(pastaFonteStr + "\\Out").mkdir();

		String criarArquivo = pastaFonteStr + "\\Out\\Summary.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(strCaminho))) {

			String linha = br.readLine();
			
			while (linha != null) {
				String[] prod = linha.split(", ");

				produtos.add(new Produtos(prod[0], Double.parseDouble(prod[1]), Integer.parseInt(prod[2])));

				linha = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(criarArquivo));) {

				for (Produtos item : produtos) {
					bw.write(item.getNome() + ", " + String.format("%.2f", item.valorTotal()));
					bw.newLine();
				}
				
				System.out.println("Criação com sucesso, caminho: " + pastaFonteStr);
			} catch (IOException e) {
				System.out.println("Erro: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		tec.close();
	}

}
