package aulas;
import java.util.Scanner;

public class MetodosComRetorno {
	static float divis�o(float a, float b) {
		float resultado = a / b;
		return resultado;
	}

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		float num1 = tec.nextFloat();
		
		System.out.println("Digite o segundo n�mero: ");
		float num2 = tec.nextFloat();
		
		float resposta = divis�o(num1, num2);
		
		System.out.println("O resultado da divis�o dos n�meros informados �: " + resposta);
		
		tec.close();
	}

}
