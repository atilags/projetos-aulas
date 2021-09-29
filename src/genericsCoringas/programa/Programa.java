package genericsCoringas.programa;

import java.util.ArrayList;
import java.util.List;

import genericsCoringas.entidades.Circulo;
import genericsCoringas.entidades.Forma;
import genericsCoringas.entidades.Retangulo;



public class Programa {

	public static void main(String[] args) {
		
		List<Forma> formas = new ArrayList<>();
		formas.add(new Retangulo(3.0, 2.0));
		formas.add(new Circulo(2.0));
		
		System.out.println("A area total é: " + String.format("%.2f", areaTotal(formas)));
		
		List<Circulo> circulos = new ArrayList<>();
		circulos.add(new Circulo(2.0));
		circulos.add(new Circulo(3.0));
		
		System.out.println("A area total dos circulos é: " + String.format("%.2f", areaTotal(circulos)));

	}
	
	public static double areaTotal(List<? extends Forma> lista) {
		double soma = 0.0;
		
		for(Forma s: lista) {
			soma += s.area();
		}
		
		return soma;
	}

}
