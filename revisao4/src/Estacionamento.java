package revisao2;

public class Estacionamento {
	String filial;
	Vaga[] vagas;
	
	public void ocuparVaga(Veiculo veiculo) {
		if (!veiculo.proprietario.autorizado) {
	        System.out.println("Não foi possível estacionar o veículo com placa " 
	        					+ veiculo.placa + " pois o proprietário " + 
	        					veiculo.proprietario.nome + " não está autorizado.");
	        return;
	    }
		
		for (Vaga vaga : vagas) {
			if (!vaga.ocupada) { 
				vaga.veiculo = veiculo;
				vaga.ocupada = true;
				System.out.println("O veículo foi estacionado com sucesso!");
				return;
			}
		}
	}
	
	public void desocuparVaga(Veiculo veiculo) {
		for (Vaga vaga : vagas) {
			if (vaga.ocupada && vaga.veiculo == veiculo) { 
				vaga.veiculo = null;
				vaga.ocupada = false;
				return;
			}
		}
	}
	
	public void exibirEstadoDasVagas() {
	    for (Vaga vaga : vagas) {
            vaga.exibirEstado();
	    }
	}
}
