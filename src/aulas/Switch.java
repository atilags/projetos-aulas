package aulas;
import java.util.Scanner;

class Switch {  
  public static void main(String args[]) { 
    Scanner tec = new Scanner(System.in);
    System.out.print("Qual a quantidade de pernas que o animal tem? ");
    int pernas = tec.nextInt();
    String tipo;

    switch (pernas){
      case 1:
        tipo = "Saci";
        break;
      case 2:
        tipo = "Bipede";
        break;
      case 4:
        tipo = "Quadrupede";
        break;
      case 6: case 8:
        tipo = "Aranha do inferno";
        break;
      default:
        tipo = "Não identificado.";
    }
    System.out.printf("Foi identificado como: %s", tipo);
    
    tec.close();
  } 
}