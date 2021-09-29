package lambda.programa;

import java.util.function.BiFunction;

import lambda.entidades.Aluno;

public class ExemplosBiFunction {
	
	public static void main(String[] args) {
						
		//BiFunction<T,U,R> Represents a function that accepts two arguments and produces a result.
		BiFunction<Integer, String, String> dados = (x, y) -> y.toUpperCase() +" "+ (2021-x) +" Anos";
		System.out.println("BiFunction concatenando dados: " + dados.apply(1992, "Vanessa"));
		System.out.println("BiFunction concatenando dados: " + dados.apply(1990, "Atila"));
		System.out.println();
		
		BiFunction<Double, Double, String> media = (p1, p2) -> ((p1+p2)/2) >= 7 ? "Aprovado" : "Reprovado";
		System.out.println("BiFunction calculando média entre p1/p2 e retornando situação do aluno: " + media.apply(8.3, 8.9));
		System.out.println("BiFunction calculando média entre p1/p2 e retornando situação do aluno: " + media.apply(1.3, 5.9));
		System.out.println();
		
		Aluno vanessa = new Aluno("Vanessa");
		vanessa.setAvaliacaoP1(5.5);
		vanessa.setAvaliacaoP2(4.5);
		BiFunction<Aluno, Aluno, String> aluno = (p1, p2) -> vanessa.media() >= 7 ? "Aprovado" : "Reprovado";
		//BiFunction<Aluno, Aluno, String> aluno = (p1, p2) -> (p1.getAvaliacaoP1()+p2.getAvaliacaoP2()/2) >= 7 ? "Aprovado" : "Reprovado";
		System.out.println("BiFunction calculando média e retornando situação do aluno a partir de uma classe: " + aluno.apply(vanessa, vanessa));
		
	}
}
