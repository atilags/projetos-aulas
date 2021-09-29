package hashCode_Equals.programa;

import java.util.Date;

import hashCode_Equals.entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Átila Sobrinho", 1150.58, new Date(), 1234567891011L);
		Funcionario f2 = new Funcionario("Vanessa Molina", 1150.58, new Date(), 1234567891012L);
		Funcionario f3 = new Funcionario("Átila Sobrinho", 1150.58, new Date(), 1234567891011L);
		
		System.out.println(f1.hashCode());
		System.out.println(f2.hashCode());
		System.out.println(f3.hashCode());
		
		System.out.println(f1.equals(f2));
		System.out.println(f2.equals(f3));
		System.out.println(f1.equals(f3));
	}

}
