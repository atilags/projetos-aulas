package aulas;
import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Programa de Media simples.");
		
		System.out.print("Quantas vezes voc� deseja executar o programa? ");		
		int quantMax = tec.nextInt();
		
		float soma = 0;
		
		for(int contador = 0; contador<quantMax; contador++) {
			System.out.printf("Ol�, favor informe a %d� nota: ", (contador+1));
			float nota = tec.nextFloat();
			soma += nota;
		}
		float media = soma/quantMax;
		System.out.printf("Ol�, o total de notas inseridas foram %d. A media em quest�o � de %.2f.", quantMax, media);
		
		tec.close();
	}

}