package revisao2;

public class Main {

	public static void main(String[] args) {
		Proprietario p1 = new Proprietario();
		p1.nome = "Ana";
		p1.habilitacao = "A123456";
		p1.autorizado = true;

        Proprietario p2 = new Proprietario();
        p2.nome = "Carlos";
        p2.habilitacao = "B654321";
        p2.autorizado = false;
		
        Veiculo carro1 = new Veiculo();
        carro1.placa = "ABC-1234";
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;
        carro1.proprietario = p1;

        Veiculo carro2 = new Veiculo();
        carro2.placa = "XYZ-5678";
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2018;
        carro2.proprietario = p2;
        
        Vaga[] vagas = new Vaga[2];
        for (int i = 0; i < vagas.length; i++) {
            vagas[i] = new Vaga();
            vagas[i].numero = i + 1;
            vagas[i].ocupada = false;
            vagas[i].veiculo = null;
        }
        
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.filial = "Centro";
        estacionamento.vagas = vagas;
        
        System.out.println("\nTentando estacionar o carro 1 (proprietário autorizado):");
        estacionamento.ocuparVaga(carro1);

        System.out.println("\nTentando estacionar o carro 2 (proprietário NÃO autorizado):");
        estacionamento.ocuparVaga(carro2);
        
        System.out.println("\nEstado das vagas:");
        estacionamento.exibirEstadoDasVagas();
	}

}
