package aulas;

import java.util.Locale;
import java.util.Scanner;

public class MatrizExercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de linhas: ");
		int linhas = tec.nextInt();
		
		System.out.print("Informe a quantidade de colunas: ");
		int colunas = tec.nextInt();
		
		int[][] matriz = new int[linhas][colunas];
		
		for(int contadorL = 0; contadorL<matriz.length; contadorL++) {
			for(int contadorC = 0; contadorC<matriz[contadorL].length; contadorC++) {
				System.out.printf("Informe o %dº número da %dª fileira: ", contadorC+1, contadorL+1);
				matriz[contadorL][contadorC] = tec.nextInt();		
			}
		}
		
		System.out.print("Qual número deve ser procurado? ");
		int procura = tec.nextInt();
		
		for(int contadorL = 0; contadorL<matriz.length; contadorL++) {
			for(int contadorC = 0; contadorC<matriz[contadorL].length; contadorC++) {
				if(matriz[contadorL][contadorC] == procura) {
					System.out.printf("Foi encontrado o número %d na posição: Linha %d e Coluna %d", procura, contadorL, contadorC);
					System.out.println();
					
					if(contadorC > 0) {
						System.out.println("Esquerda: " + matriz[contadorL][contadorC-1]);
					}
					
					if(contadorL > 0) {
						System.out.println("Cima: " + matriz[contadorL-1][contadorC]);
					}
					
					if(contadorC < matriz[contadorL].length-1) {
						System.out.println("Direita: " + matriz[contadorL][contadorC+1]);
					}
					
					if(contadorL < matriz.length-1) {
						System.out.println("Baixo: " + matriz[contadorL+1][contadorC]);
					}
					
				}
			}
		}
		
		
		tec.close();
	}

}
