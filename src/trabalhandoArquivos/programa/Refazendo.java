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

public class Refazendo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		List<Produtos> produtos = new ArrayList<>();
		
		System.out.print("Favor informar o caminho para o arquivo dos produtos: ");
		String caminhoArq = tec.nextLine();
		
		File arquivo = new File(caminhoArq);
		
		String caminhoPast = arquivo.getParent();
		
		boolean novaPasta = new File(caminhoPast + "\\Saida").mkdir();
		
		System.out.println("Criação de pasta: " + novaPasta);
		
		String novoArq = caminhoPast + "\\Saida\\Arquivo Saida.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoArq))){
			
			String linha = br.readLine();
			
			while(linha != null) {
				
				String[] separador = linha.split(", ");
				
				produtos.add(new Produtos(separador[0], Double.parseDouble(separador[1]), Integer.parseInt(separador[2])));
				
				linha = br.readLine();
				
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(novoArq))){
				
				for(Produtos produto: produtos) {
					bw.write(produto.getNome() + ", " + produto.valorTotal());
					bw.newLine();
				}
				
			} catch (IOException e) {
				System.out.println("Erro: " + e.getMessage());
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		tec.close();
	}

}
