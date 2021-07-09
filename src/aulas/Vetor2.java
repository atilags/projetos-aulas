package aulas;
import java.util.Scanner;
// import java.util.Arrays;

public class Vetor2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int numero[] = new int[2];
	    /*
	     * Também pode declarar o vetor assim int valor[] = {1, 8, 6, 8, 3}; Já possui seu tamanho e seu conteudo definido.
	     * 
	     * Arrays.fill(numero, 8); Irá preencher todos os espaços do vetor com o número 8
	     * 
	     * Na situação int valor[] = {1, 8, 6, 18, 3} , int procura = Arrays.binarySearch(numero, 6);, 
	     * esse comando irá dizer em qual posição do vetor está o número 6, no caso posição 2.
		*/
		
		int contador = 1;
		
	    for(int cc = 0; cc<numero.length; cc++){
	    	
	        System.out.printf("Digite o %dº valor: ", (cc+1));
	        numero[cc]= tec.nextInt();
	        
	      }
	    
	    // Arrays.sort(numero);
	    // Esse comando serve para organizar o vetor na ordem crescente, é preciso importar " import java.util.Arrays; "
	    
		for (int valor: numero) {
			
			System.out.printf("Olá, o %dº valor do número é: %d\n", contador, valor);
			contador += 1;
			
		}
		
		tec.close();
	}

}
