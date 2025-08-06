package revisao2;

public class Proprietario {
	String nome;
	String habilitacao;
	boolean autorizado;
	
	public void exibirDados() {
	    System.out.println("--- Proprietário ---");
	    System.out.println("Nome: " + nome);
	    System.out.println("Habilitação: " + habilitacao);
	    System.out.println("Autorizado: " + (autorizado ? "Sim" : "Não"));
	}
}
