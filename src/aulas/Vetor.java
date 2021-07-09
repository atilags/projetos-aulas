package aulas;
import java.util.Scanner;

public class Vetor {
	
  public static void main(String args[]) {
    
    Scanner tec = new Scanner(System.in);
    
    int valor[] = new int[4];
    
    for(int contador = 0; contador<valor.length; contador++){
    	
      System.out.printf("Digite o %dº valor: ", (contador+1));
      
      valor[contador]= tec.nextInt();
      
    }
    
    System.out.printf("Vetor posição 0 vale %d\nVetor posição 1 vale %d\nVetor posição 2 vale %d\nVetor posição 3 vale %d", valor[0], valor[1], valor[2], valor[3]);
    
    tec.close();
  } 
}
