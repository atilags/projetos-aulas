package aulas;

import java.util.ArrayList;
import java.util.List;

public class ListaSplit {

	public static void main(String[] args) {
		
		String frase1 = "Olá, Mundo";
		String frase2 = "Musa está lendo?";
		String frase3 = "Linda e maravilhosa";
		
		List<String> lista = new ArrayList<>();
		
		lista.add(frase1);
		lista.add(frase2);
		lista.add(frase3);
		
		String fraseCheia = "";
		
		for(int i = 0; i<lista.size(); i++) {
			String[] divisao= lista.get(i).split(" ");
			
			if(i == lista.size()-1) {
				fraseCheia = fraseCheia + divisao[0] + " !";
			}else {
				fraseCheia = fraseCheia + divisao[0] + " ";
			}
		}
		
		System.out.println(fraseCheia);
		
	}

}
