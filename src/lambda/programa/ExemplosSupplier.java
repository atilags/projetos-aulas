package lambda.programa;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;

import lambda.entidades.Aluno;

public class ExemplosSupplier {
	public static void main(String[] args) {
		
		Supplier<Date> dataAgora = () -> new Date();
		System.out.println(dataAgora.get());
		System.out.println();
		
		Supplier<LocalDate> supplierLocalDate = () -> LocalDate.now();//--------------------------------------> Supplier LocalDate para retorno da data sem formatação
		System.out.println(supplierLocalDate.get());		
		System.out.println();
		
		Supplier<Date> supplierDateLambda = Date::new;
		System.out.println(supplierDateLambda.get());
		System.out.println();
		
		Supplier<LocalDate> supplierLocalDateLambda = LocalDate::now;//---------------------------> Supplier com expressão lambda, para retorno de data sem formatação
		System.out.println(supplierLocalDateLambda.get());		
		System.out.println();
		
		
		// SUPPLIER -> não aceita argumentos e retorna um resultado -> () obrigatório.				Supplier<T>	Represents a supplier of results.
		
		Supplier<List<String>> listagem = () -> Arrays.asList("Vanessa", "Atila", "Google", "Yahoo", "Davidson");//-------------> Supplier retornando uma List<String>
		System.out.println(listagem.get());		
		System.out.println();
		
		Supplier<Object> objeto = () -> new Aluno("Vanessa");//---------------------------------------------------------> Supplier retornando um objeto
		System.out.println(objeto.get());       
		System.out.println();
		
		Supplier<String> meuNome = () -> "Vanessa " + 28 + " anos";//-----------------------------------------> Supplier retornando uma String concatenada com Integer
		System.out.println(meuNome.get());
	}
} 
