package lambda.utilitarios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class MeuSupplier implements Supplier<String>{

	@Override
	public String get() {
		DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return dataFormat.format(LocalDateTime.now());
	}

}
