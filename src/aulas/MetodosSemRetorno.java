package aulas;
import java.util.Scanner;
//import java.util.Arrays;

public class MetodosSemRetorno {

	static void divisao(float a, float b) {
		float resultado = a / b;
		System.out.println("O resultado da divis�o �: " + resultado);
	}

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Ol�, por favor informe o primeiro n�mero: ");
		float num1 = tec.nextFloat();

		System.out.print("Favor, informe o segundo n�mero: ");
		float num2 = tec.nextFloat();

		divisao(num1, num2);
		
		tec.close();
	}

}
