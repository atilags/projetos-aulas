package tratamentoExcecoes.modelo.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import tratamentoExcecoes.modelo.excecoes.ExcecoesDominio;

public class Reservas {
	
	private Integer numQuarto;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservas(Integer numQuarto, Date checkIn, Date checkOut) throws ExcecoesDominio {
		if(!checkOut.after(checkIn)) {
			throw new ExcecoesDominio("A data de check-out deve ser uma data futura a de check-in.");
		}
		this.numQuarto = numQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(Integer numQuarto) {
		this.numQuarto = numQuarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duracao() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDatas(Date checkIn, Date checkOut) throws ExcecoesDominio {
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new ExcecoesDominio("A data de reserva deve ser uma data futura.");
		}
		if(!checkOut.after(checkIn)) {
			throw new ExcecoesDominio("A data de check-out deve ser uma data futura a de check-in.");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Quarto: " + numQuarto + 
				"\nCheckIn: " + sdf.format(checkIn) + 
				"\nCheckOut: " + sdf.format(checkOut) + 
				"\nDuração: " + duracao() + " noite/s";
	}
}
