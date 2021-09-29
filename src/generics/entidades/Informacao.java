package generics.entidades;

import java.util.ArrayList;
import java.util.List;

public class Informacao<T> {
	
	private List<T> informacoes = new ArrayList<>();
	
	public Informacao() {
	}

	public List<T> getInformacoes() {
		return informacoes;
	}

	public void addInformacoes(T objeto) {
		informacoes.add(objeto);
	}
	
	public T primeiroIndex() {
		if(informacoes.isEmpty()) {
			throw new IllegalStateException("A lista está vazia.");
		}else {
			return informacoes.get(0);
		}
	}
	
	public T toString(int i) {
		return informacoes.get(i);
	}
}
