package abstratos.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import abstratos.entidades.Forma;
import abstratos.entidades.Retangulo;
import abstratos.entidades.Circulo;
import abstratos.entidades.enums.Cor;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		List<Forma> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = tec.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = tec.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Cor cor = Cor.valueOf(tec.next());
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = tec.nextDouble();
				System.out.print("Height: ");
				double height = tec.nextDouble();
				list.add(new Retangulo(cor, width, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = tec.nextDouble();
				list.add(new Circulo(cor, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Forma shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		tec.close();
	}
}