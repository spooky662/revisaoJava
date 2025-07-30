package revisao2;

public class Livro {
	private String titulo;
	private Autor autor;
	
	public Livro(String titulo, Autor autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public void exibirDados() {
		System.out.println("Titulo: " + getTitulo() + ", Autor: " + autor.getNome());
	}
}
