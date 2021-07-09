package aulas;
import java.util.Scanner;

class While {  
  public static void main(String args[]) { 
    Scanner tec = new Scanner(System.in);
    System.out.print("Quantas vezes deseja repetir o programa? ");
    int contadorMax = tec.nextInt();
    int contador = 0;
    while (contador<contadorMax){
      System.out.printf("Execução número %d, Átila ama a Musa!\n", contador+1);
      contador ++;
      if (contador == 5){
        break;
      }
    }
    System.out.printf("O programa acabou apos ser executado %d vezes.", contador);
    
    tec.close();
  }
}