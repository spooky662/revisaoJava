package revisao2;

public class Vaga {
	int numero;
	Veiculo veiculo;
	boolean ocupada;
	
	public void exibirEstado() {
        if (ocupada) {
            System.out.println("Vaga " + numero + " está ocupada.");
        } else {
            System.out.println("Vaga " + numero + " está vazia.");
        }
	}
}
