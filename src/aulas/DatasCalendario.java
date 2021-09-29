package aulas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


public class DatasCalendario {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Date teste1 = Date.from(Instant.parse("2021-04-26T20:40:00Z"));
		Date teste2 = Date.from(Instant.parse("2021-04-26T20:40:00Z"));
		
		System.out.println(sdf.format(teste1));
		
		Calendar cal = Calendar.getInstance(); // Criação de calendario.
		cal.setTime(teste1); // Data informada na variavel teste1 foi alocada no calendario.
		cal.add(Calendar.HOUR_OF_DAY, 4); // Data do calendario foi adicionado 4 horas.
		teste1 = cal.getTime(); // Variavel teste1 recebeu a data contida na variavel calendario.
		
		System.out.println(sdf.format(teste1));
		System.out.println();
		System.out.println();
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(teste2);
		
		int minutos = cal2.get(Calendar.MINUTE); // Pegou os minutos informados no horario.
		int hora = cal2.get(Calendar.HOUR_OF_DAY);
		int dia = cal2.get(Calendar.DAY_OF_YEAR);
		int mes = 1 + cal2.get(Calendar.MONTH); // Janeiro seria o mes 0, por isso é preciso somar 1 sempre.
		
		System.out.println("Minutos: " + minutos);
		System.out.println("Horas: " + hora);
		System.out.println("Dia do ano: " + dia);
		System.out.println("Mês: " + mes);
	}

}
