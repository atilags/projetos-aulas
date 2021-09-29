package lambda.programa;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierDate {	
	
	public static void main(String[] args) {
		
		//FORMATAÇÃO DA DATA DE HOJE
		DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(dataFormat.format(LocalDateTime.now()));
		
		
		//SUPPLIER PARA OBTER A HORASupplier<String
		Supplier<String> dataHoje = () -> dataFormat.format(LocalDateTime.now());
		//Supplier<String> dataHoje = new MeuSupplier();
		
		//FORMATAÇÃO DE HORA
		DateTimeFormatter horaFormat = DateTimeFormatter.ofPattern("HH:mm");			
		//SUPPLIER PARA OBTER A HORA
	    Supplier<String> hora = () -> horaFormat.format(LocalDateTime.now());
	     
	     
	     System.out.println("Data de hoje: " + dataHoje.get());
	     System.out.println();
	     System.out.println("Hora atual: " + hora.get());
	     
	     
	     SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	     Supplier<String> dataHoje2 = () -> sdf.format(new Date());
	     System.out.println("DATE: " + dataHoje2.get());
	     
	     
	     
	}

}
