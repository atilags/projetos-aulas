package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da matriz: ");
		int tamanho = tec.nextInt();
		
		int[][] matriz = new int[tamanho][tamanho];
		
		for(int contadorL = 0; contadorL<matriz.length; contadorL++) {
			for(int contadorC = 0; contadorC<matriz[contadorL].length; contadorC++) {
				System.out.printf("Informe o %dº número da %dº linha: ", contadorC+1, contadorL+1);
				matriz[contadorL][contadorC] = tec.nextInt();
			}
		}
		
		int contagemNegativo =0;
		
		for(int contadorL = 0; contadorL<matriz.length; contadorL++) {
			for(int contadorC = 0; contadorC<matriz[contadorL].length; contadorC++) {
				if(matriz[contadorL][contadorC] < 0) {
					contagemNegativo += 1;
				}
			}
		}
		
		for(int contador = 0; contador<matriz.length; contador++) {
			System.out.print(matriz[contador][contador] + " ");
		}
		
		System.out.println();
		
		System.out.println("Quantidade de números negativos: " + contagemNegativo);
		
		tec.close();
	}

}
