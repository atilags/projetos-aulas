package aulas;

public class Strings {

	public static void main(String[] args) {
		
		String original = "Come�ando UM TESte nesSE moMenTUM   ";
		
		String lower = original.toLowerCase();
		String upper = original.toUpperCase();
		String trim = original.trim();
		String subString = original.substring(6);
		String subString2 = original.substring(6, 16);
		String replace = original.replace("m", "B");
		String replace2 = original.replace("Com", "cooome�ando");
		int index = original.indexOf("UM");
		int lastIndex = original.lastIndexOf("UM");
		String separar[]= original.split(" ");
		String separar0 = separar[0];
		String separar1 = separar[1];
		String separar2 = separar[2];
		String separar3 = separar[3];
		String separar4 = separar[4];
		String teste = "Mu";
		System.out.println(teste.concat("sa"));
		System.out.println(teste.startsWith("Mu"));
		
		System.out.println("Base: " + original);
		System.out.println("Minusculo: " + lower);
		System.out.println("Maiusculo: " + upper);
		System.out.println("Excluindo todos os 'espa�os': " + trim);
		System.out.println("Come�ando a partir do espa�o 6: " + subString);
		System.out.println("Come�ando do espa�o 6 at� o 16: " + subString2);
		System.out.println("Replace m por B: " + replace);
		System.out.println("Replace Com por cooome�ando: " + replace2);
		System.out.println("Localiza o index de 'UM': " + index);
		System.out.println("Localiza o ultimo index de 'UM': " + lastIndex);
		System.out.println("Separando a String por vetor: " + separar0);
		System.out.println("Separando a String por vetor: " + separar1);
		System.out.println("Separando a String por vetor: " + separar2);
		System.out.println("Separando a String por vetor: " + separar3);
		System.out.println("Separando a String por vetor: " + separar4);
		
	}

}
