package aulas;
import java.util.Scanner;
// import java.util.Arrays;

public class Vetor2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int numero[] = new int[2];
	    /*
	     * Tamb�m pode declarar o vetor assim int valor[] = {1, 8, 6, 8, 3}; J� possui seu tamanho e seu conteudo definido.
	     * 
	     * Arrays.fill(numero, 8); Ir� preencher todos os espa�os do vetor com o n�mero 8
	     * 
	     * Na situa��o int valor[] = {1, 8, 6, 18, 3} , int procura = Arrays.binarySearch(numero, 6);, 
	     * esse comando ir� dizer em qual posi��o do vetor est� o n�mero 6, no caso posi��o 2.
		*/
		
		int contador = 1;
		
	    for(int cc = 0; cc<numero.length; cc++){
	    	
	        System.out.printf("Digite o %d� valor: ", (cc+1));
	        numero[cc]= tec.nextInt();
	        
	      }
	    
	    // Arrays.sort(numero);
	    // Esse comando serve para organizar o vetor na ordem crescente, � preciso importar " import java.util.Arrays; "
	    
		for (int valor: numero) {
			
			System.out.printf("Ol�, o %d� valor do n�mero �: %d\n", contador, valor);
			contador += 1;
			
		}
		
		tec.close();
	}

}
