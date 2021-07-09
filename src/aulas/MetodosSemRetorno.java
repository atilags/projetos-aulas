package aulas;
import java.util.Scanner;
//import java.util.Arrays;

public class MetodosSemRetorno {

	static void divisao(float a, float b) {
		float resultado = a / b;
		System.out.println("O resultado da divisão é: " + resultado);
	}

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Olá, por favor informe o primeiro número: ");
		float num1 = tec.nextFloat();

		System.out.print("Favor, informe o segundo número: ");
		float num2 = tec.nextFloat();

		divisao(num1, num2);
		
		tec.close();
	}

}
