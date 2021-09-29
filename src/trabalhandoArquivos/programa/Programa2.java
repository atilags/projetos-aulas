package trabalhandoArquivos.programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa2 {

	public static void main(String[] args) {
		
		String caminho = "D:\\Downloads\\Programação\\Java\\Projetos Eclipse\\GitHub\\src\\trabalhandoArquivos\\in.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);
			//br = new BufferedReader(new FileReader(caminho));
			
			String linha = br.readLine(); // Irá ler até o br.readline ser igual a null
			
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine(); // Irá ler a proxima linha do arquivo
			}
		} catch(IOException e) {
			System.out.println("Erro gerado: " + e.getMessage());
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
