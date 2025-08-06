package revisao2;

public class Veiculo {
	String placa;
	String marca;
	String modelo;
	int ano;
	Proprietario proprietario;
	
	public void exibsirDados() {
	    System.out.println("=== Dados do Veículo ===");
	    System.out.println("Marca: " + marca);
	    System.out.println("Modelo: " + modelo);
	    System.out.println("Ano: " + ano);
	    System.out.println("Placa: " + placa);
	    
	    if (proprietario != null) {
	        proprietario.exibirDados();
	    } else {
	        System.out.println("Proprietário: Não informado.");
	    }
	    System.out.println("=========================");
	}
}
