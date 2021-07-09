package stringbuilder.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private String titulo;
	private String conteudo;
	private Integer likes;
	
	private List<Comentario> comentarios = new ArrayList<>();
	
	public Post(Date momento, String titulo, String conteudo, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}
	
	public Date getMomento() {
		return momento;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public List<Comentario> getComentarios(){
		return comentarios;
	}
	
	public void criarComentario(Comentario texto){
		comentarios.add(texto);
	}
	
	public void removerComentario(Comentario texto) {
		comentarios.remove(texto);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(formatoData.format(momento) + "\n");
		sb.append(conteudo + "\n");
		sb.append("Comentarios:" + "\n");
		
		for(Comentario n: comentarios) {
			sb.append(n + "\n");
		}
		
		return sb.toString();
	}
	
}
