package trabalhandoArquivos.programa;

import java.io.File;

public class Programa6 {

	public static void main(String[] args) {
		
		String caminho = "D:\\Downloads\\Programação\\Java";
		
		File pasta = new File(caminho);
		
		System.out.println("getName: " + pasta.getName());
		System.out.println();
		
		System.out.println("getParent: " + pasta.getParent());
		System.out.println();
		
		System.out.println("getPath: " + pasta.getPath());
		System.out.println();
	}

}
