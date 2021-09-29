package lambda.programa;

import java.util.function.Function;

import lambda.entidades.Aluno;

public class ExemplosFunction {

	public static void main(String[] args) {

		// Function<T,R> Represents a function that accepts one argument and produces a result.
		
		Function<Integer, String> situacao = valor -> valor >= 18 ? "Maior de idade" : "Menor de idade";
		int idade = 26;
		System.out.println("Function avaliando idade: " + situacao.apply(idade));
		System.out.println();

		
		Aluno vanessa = new Aluno("Vanessa");
		vanessa.setAvaliacaoP1(8.5);
		Function<Double, String> avaliacaoNotaClasse = nota -> nota >= 8 ? Double.toString(nota) + " Ótimo Aluno! " : " Aluno regular: " + Double.toString(nota);
		System.out.println("Function avaliando nota de uma classe: " + avaliacaoNotaClasse.apply(vanessa.getAvaliacaoP1()));
		System.out.println();

		
		vanessa.setAvaliacaoP1(8.5);
		vanessa.setAvaliacaoP2(9.5);
		Function<Aluno, String> verAluno = aluno -> 
		"\nAluno: " + aluno.getNome() + " \nNota p1: " + aluno.getAvaliacaoP1() + " \nNota p2: " + aluno.getAvaliacaoP2() + " \nMédia: " + aluno.media();
		System.out.println("Function recebendo 1 aluno e retornando valor das avaliações: \n" + verAluno.apply(vanessa));

	}

}
