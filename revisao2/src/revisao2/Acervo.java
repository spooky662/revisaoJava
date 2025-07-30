package revisao2;

import java.util.ArrayList;

public class Acervo {
	private ArrayList<Livro> livros;

	public Acervo() {
		livros = new ArrayList<>();
	}
	
	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}

	public void exibirDados() {
		for (Livro livro : livros) {
			livro.exibirDados();
		}
	}
	
}
