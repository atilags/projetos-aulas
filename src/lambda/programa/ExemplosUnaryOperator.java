package lambda.programa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

import lambda.entidades.Aluno;

public class ExemplosUnaryOperator {

	public static void main(String[] args) {

		// Recebe apenas 1 parâmetro
		// Retorna UM RESULTADO do tipo parâmetro -> String
		// () não é obrigatório
		UnaryOperator<String> nomeMaiusculo = a -> a.toUpperCase();
		System.out.println(nomeMaiusculo.apply("atila"));

		Aluno aluno = new Aluno("muso");
		UnaryOperator<Aluno> retorno = a -> a;
		System.out.println(retorno.apply(aluno));

		UnaryOperator<String> frase1 = a -> a;
		UnaryOperator<String> frase2 = a -> a += "Klayn ";
		UnaryOperator<String> frase3 = a -> a += "Ramos ";
		UnaryOperator<String> frase4 = a -> a += "Molina ";

		String nomes = frase1.andThen(frase2).andThen(frase3).andThen(frase4).apply("Vanessa ");

		System.out.println(nomes);

		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;

		int resultado1 = // Na sequência
				maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(2);

		System.out.println(resultado1);

		List<Aluno> lista = new ArrayList<>(Arrays.asList(new Aluno("Atila"), new Aluno("Vanessa"), new Aluno("Davi")));
		lista.get(0).setAvaliacaoP1(10);
		lista.get(0).setAvaliacaoP2(5);
		lista.get(1).setAvaliacaoP1(10);
		lista.get(1).setAvaliacaoP2(9);
		lista.get(2).setAvaliacaoP1(8);
		lista.get(2).setAvaliacaoP2(4);

		UnaryOperator<List<Aluno>> maiorNota = a -> {
			int index = 0;
			double media = 0;

			for (int i = 0; i < a.size(); i++) {
				if (a.get(i).media() > media) {
					media = a.get(i).media();
					index = i;
				}
			}
			return new ArrayList<>(Arrays.asList(a.get(index)));
		};

		for (Aluno a : maiorNota.apply(lista)) {
			System.out.println(a);
		}

		//maiorNota.apply(lista).forEach(System.out::println);

	}

}
