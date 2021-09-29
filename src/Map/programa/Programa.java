package Map.programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		//System.out.println("Favor informar o caminho do arquivo: ");
		//String caminho = tec.nextLine();
		String caminho = "D:\\Downloads\\Programação\\Java\\Projetos Eclipse\\GitHub\\src\\Map\\in.txt";
		
		Map<String, Integer> votacoes = new HashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
			String linha = br.readLine();
			
			while(linha != null) {
				
				String[] split = linha.split(", ");
				int votosAtuais = Integer.parseInt(split[1]);
				
				if(votacoes.containsKey(split[0])) {
					int votosSomados = votacoes.get(split[0]);
					votacoes.put(split[0], votosSomados+votosAtuais);
					
				}else {
					votacoes.put(split[0], Integer.parseInt(split[1]));
				}
				
				linha = br.readLine();
			}
			
			for(String key: votacoes.keySet()) {
				System.out.println(key + ": " + votacoes.get(key));
			}
			
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}catch(RuntimeException e) {
			System.out.println("Um erro inexperado ocorreu, sentimos muito.");
		}
		
		
		tec.close();
	}

}
