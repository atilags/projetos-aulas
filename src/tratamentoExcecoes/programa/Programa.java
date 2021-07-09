package tratamentoExcecoes.programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import tratamentoExcecoes.modelo.entidades.Reservas;
import tratamentoExcecoes.modelo.excecoes.ExcecoesDominio;

public class Programa {

	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Número do quarto: ");
			int numQuarto = tec.nextInt();
			System.out.print("Data de check-in dd/MM/yyyy: ");
			Date checkIn = sdf.parse(tec.next());
			System.out.print("Data de check-out dd/MM/yyyy: ");
			Date checkOut = sdf.parse(tec.next());
			
			Reservas reserva = new Reservas(numQuarto, checkIn, checkOut);
			System.out.print("- Reserva -\n" + reserva);
			
			System.out.println();
			System.out.println();
			System.out.println("Passe as informações atualizadas agora:");
			System.out.print("Data de check-in atualizada dd/MM/yyyy: ");
			checkIn = sdf.parse(tec.next());
			System.out.print("Data de check-out atualizada dd/MM/yyyy: ");
			checkOut = sdf.parse(tec.next());
			
			reserva.updateDatas(checkIn, checkOut);
			System.out.print("- Reserva atualizada -\n" + reserva);
		}
		catch(ParseException e) {
			System.out.println("Formado de data invalida.");
		}
		catch(ExcecoesDominio e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("Número de quarto digitado incorretamente.");
		}
		catch(RuntimeException e) {
			System.out.println("Algum erro inexperado ocorreu.");
		}
		
		tec.close();
	}

}
