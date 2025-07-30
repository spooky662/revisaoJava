package revisao;

public class Main {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Caneta", 2.50, 10);
		Produto p2 = new Produto();
		
		p2.setNome("Lapis");
		p2.setPreco(2.00);
		p2.setQuantidade(15);
		
		p1.exibirDados();
		p2.exibirDados();
		
	}

}
