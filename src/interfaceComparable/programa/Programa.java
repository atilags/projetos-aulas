package interfaceComparable.programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interfaceComparable.entidades.Funcionarios;

public class Programa {

	public static void main(String[] args) {
		
		List<Funcionarios> funcionarios = new ArrayList<>();
		String caminho = "D:\\Downloads\\Programação\\Java\\Projetos Eclipse\\GitHub\\src\\interfaceComparable\\funcionarios.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
			String linha = br.readLine();
			
			while(linha != null) {
				String[] splitLinha = linha.split(", ");
				funcionarios.add(new Funcionarios(splitLinha[0], Double.parseDouble(splitLinha[1])));
				linha = br.readLine();
			}
			
			Collections.sort(funcionarios); // Organiza de acordo com o que está setado na classe Funcionarios, na area " compareTo "
			
			for(Funcionarios funcionario: funcionarios) {
				System.out.println(funcionario);
			}
			
		} catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}

}
