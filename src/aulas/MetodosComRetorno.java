package aulas;
import java.util.Scanner;

public class MetodosComRetorno {
	static float divisão(float a, float b) {
		float resultado = a / b;
		return resultado;
	}

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		float num1 = tec.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		float num2 = tec.nextFloat();
		
		float resposta = divisão(num1, num2);
		
		System.out.println("O resultado da divisão dos números informados é: " + resposta);
		
		tec.close();
	}

}
