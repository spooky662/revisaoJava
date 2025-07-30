package revisao2;

public class Main {

	public static void main(String[] args) {
		
		Autor autor1 = new Autor("Graciliano Ramos", "Brasileiro");
		Autor autor2 = new Autor("Machado de Assis", "Brasileiro");
		Autor autor3 = new Autor("George Orwell", "Britânico");
		
		autor1.exibirDados();
		
		Livro livro1 = new Livro("Vidas Secas", autor1);
		Livro livro2 = new Livro("Dom Casmurro", autor2);
		Livro livro3 = new Livro("1984", autor3);
		Livro livro4 = new Livro("Helena", autor2);
		
		livro3.exibirDados();

		Acervo acervo = new Acervo();
		
		acervo.adicionarLivro(livro1);
		acervo.adicionarLivro(livro2);
		acervo.adicionarLivro(livro3);
		acervo.adicionarLivro(livro4);
		
		acervo.exibirDados();

	}

}
