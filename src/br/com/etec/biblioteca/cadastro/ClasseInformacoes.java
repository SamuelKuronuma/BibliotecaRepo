package br.com.etec.biblioteca.cadastro;

public class ClasseInformacoes {
	
	String titulosAt;
	String subtitulosAt;
	int numerosPaginasAt;
	String autoresAt;
	String generosAt;
	
	//Construtor vazio
	
	public ClasseInformacoes(){
	
	}
	
	//Construtor vazio
	
	public ClasseInformacoes(String autor, String titulo){
		this.autoresAt = autor;
		this.titulosAt = titulo;
	}
	
	//Getters
	
	public String getAutores(){
		return autoresAt;
	}
	public String getSubtitulos(){
		return subtitulosAt;
	}
	public int getNumerosPaginas(){
		return numerosPaginasAt;
	}
	public String getGeneros(){
		return generosAt;
	}
	public String getTitulos(){
		return titulosAt;
	}
	
	//Setters
	
	public void setAutores(String autores){
		this.autoresAt = autores;
	}
	
	public void setSubTitulos(String sub){
		this.subtitulosAt = sub;
	}
	
	public void setNumerosPaginas(int page){
		this.numerosPaginasAt = page;
	}
	public void setGeneros(String generos){
		this.generosAt = generos;
	}
	public void setTitulos(String titulos){
		this.titulosAt = titulos;
	}
}
