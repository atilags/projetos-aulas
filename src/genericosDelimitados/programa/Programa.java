package genericosDelimitados.programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import genericosDelimitados.entidades.Produtos;
import genericosDelimitados.servicos.ServicoCalculo;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Produtos> list = new ArrayList<>();

		String path = "D:\\Downloads\\Programação\\Java\\Projetos Eclipse\\GitHub\\src\\geneticosDelimitados\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Produtos(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Produtos x = ServicoCalculo.max(list);
			
			System.out.println("Most expensive:");
			System.out.println(x);
			//System.out.println(ServicoCalculo.max(list));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
}