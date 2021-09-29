package trabalhandoArquivos.programa;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		File arquivo = new File("D:\\Downloads\\Programação\\Java\\Projetos Eclipse\\GitHub\\src\\trabalhandoArquivos\\in.txt");
		
		Scanner tec = null;
		
		try {
			tec = new Scanner(arquivo);
			while(tec.hasNextLine()) {
				System.out.println(tec.nextLine());
			}
		} catch(IOException e) {
			System.out.println("Foi gerado o erro: " + e.getMessage());
		} finally {
			if(tec != null) {
				tec.close();
			}
		}
	}

}
