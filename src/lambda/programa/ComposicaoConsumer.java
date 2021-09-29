package lambda.programa;

import java.util.function.Consumer;

import lambda.entidades.Aluno;

public class ComposicaoConsumer {

	public static void main(String[] args) {

		Aluno vanessa = new Aluno("Musa");

		Consumer<Aluno> av1 = a -> a.setAvaliacaoP1(8.3);
		Consumer<Aluno> av2 = a -> a.setAvaliacaoP2(7.3);
		Consumer<Aluno> resultado = a -> System.out.println(a);

		av1.andThen(av2).andThen(resultado).accept(vanessa);

	}

}
