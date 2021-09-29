package Map.programa;

import java.util.HashMap;
import java.util.Map;

import Map.entidades.Basico2_Produto;

public class Basico2 {

	public static void main(String[] args) {
		
		Map<Basico2_Produto, Double> estoque = new HashMap<>();
		
		Basico2_Produto p1 = new Basico2_Produto("Tv", 900.0);
		Basico2_Produto p2 = new Basico2_Produto("Notebook", 1200.0);
		Basico2_Produto p3 = new Basico2_Produto("Tablet", 400.0);
		
		estoque.put(p1, 10000.0);
		estoque.put(p2, 20000.0);
		estoque.put(p3, 15000.0);
		
		Basico2_Produto ps = new Basico2_Produto("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + estoque.containsKey(ps));
		
	}

}
