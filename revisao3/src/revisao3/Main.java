package revisao3;

public class Main {

	public static void main(String[] args) {
		
		Funcionario f1 = new FuncionarioCLT("Maria", 101, 3000, 500);
		Funcionario f2 = new FuncionarioTerceiro("João", 202, 25, 160);

		f1.exibirDados();
		f2.exibirDados();

	}

}
