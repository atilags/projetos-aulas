package stringbuilder.programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import stringbuilder.entidades.Comentario;
import stringbuilder.entidades.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Comentario c1 = new Comentario("Primeiro teste de comentario.");
		Comentario c2 = new Comentario("Segundo teste de comentario.");
		
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date momento = formatoData.parse("21/06/2018 13:05:44");
		String titulo = "Primeiro titulo";
		String conteudo = "Conteudo do Post";
		Integer likes = 12;
		
		Post post1 = new Post(momento, titulo, conteudo, likes);
		
		post1.criarComentario(c1);
		post1.criarComentario(c2);
		
		Comentario c3 = new Comentario("Terceiro teste de comentario.");
		Comentario c4 = new Comentario("Quarto teste de comentario.");
		
		Date momento2 = formatoData.parse("28/07/2018 23:40:19");
		String titulo2 = "Terceiro titulo";
		String conteudo2 = "Conteudo do Post Dois";
		Integer likes2 = 5;
		
		Post post2 = new Post(momento2, titulo2, conteudo2, likes2);
		
		post2.criarComentario(c3);
		post2.criarComentario(c4);
		
		System.out.println(post1);
		System.out.println();
		System.out.println(post2);
		
	}

}
