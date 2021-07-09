package aulas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;


public class Datas {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); // converte o sdf3 para o fuso horario GMT.
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L); // 1000 milissegundos * 60 é igual a minutos, isso * 60 é igual a hora * 5 para dar 5 horas.
		
		Date y1 = sdf1.parse("26/04/2021");
		Date y2 = sdf2.parse("26/04/2021 20:06:40");
		Date y3 = Date.from(Instant.parse("2021-04-26T20:06:40Z")); // Horario UTC, +3 horas do fuso brasileiro.
		
		System.out.println(y1);
		
		System.out.println(y2);
		
		System.out.println();
		
		System.out.println(sdf2.format(y1));
		
		System.out.println(sdf2.format(y2));
		
		System.out.println(sdf3.format(y3));
		
		System.out.println();
		
		System.out.println("Hora atual formatada: " + sdf2.format(x1));
		System.out.println("Hora atual não formatada: " + x1);
		System.out.println("Hora atual criada diferente: " + x2);
		System.out.println("Horario no momento da criação, -3 horas pelo fuso horario brasileiro: " + x3);
		System.out.println("5 horas após a criação do horario, -3 horas pelo fuso horario brasileiro: " + x4);
		
		tec.close();
	}

}
