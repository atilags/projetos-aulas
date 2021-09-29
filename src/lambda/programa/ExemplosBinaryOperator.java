package lambda.programa;

import java.util.function.BinaryOperator;

import lambda.entidades.Aluno;

public class ExemplosBinaryOperator {

	public static void main(String[] args) {

		// Recebe 2 parâmetros
		// Retorna UM RESULTADO do tipo de parâmetro -> Integer
		// () obrigatório

		BinaryOperator<Integer> media = (a, b) -> (a + b) / 2;
		System.out.println(media.apply(10, 2));

		Aluno vanessa = new Aluno("Vanessa");
		vanessa.setAvaliacaoP1(10);
		vanessa.setAvaliacaoP2(9.8);

		Aluno atila = new Aluno("Atila");
		atila.setAvaliacaoP1(9.9);
		atila.setAvaliacaoP2(10);

		BinaryOperator<Aluno> melhorAluno = (a, b) -> {

			if (a.media() > b.media()) {
				return a;
			} else {
				return b;
			}

		};
		
		System.out.println(melhorAluno.apply(vanessa, atila));

	}

	// BinaryOperator<T> Represents an operation upon two operands of the same type,
	// producing a result of the same type as the operands.

}
