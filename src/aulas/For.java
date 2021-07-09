package aulas;
import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Programa de Media simples.");
		
		System.out.print("Quantas vezes você deseja executar o programa? ");		
		int quantMax = tec.nextInt();
		
		float soma = 0;
		
		for(int contador = 0; contador<quantMax; contador++) {
			System.out.printf("Olá, favor informe a %dº nota: ", (contador+1));
			float nota = tec.nextFloat();
			soma += nota;
		}
		float media = soma/quantMax;
		System.out.printf("Olá, o total de notas inseridas foram %d. A media em questão é de %.2f.", quantMax, media);
		
		tec.close();
	}

}