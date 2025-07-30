package revisao3;

public class FuncionarioTerceiro extends Funcionario{

	private double valorHora;
	private double quantidadeDeHoras;

	public FuncionarioTerceiro(String nome, int matricula, 
			double valorHora, double quantidadeDeHoras) {
		super(nome, matricula);
		this.valorHora = valorHora;
		this.quantidadeDeHoras = quantidadeDeHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getQuantidadeDeHoras() {
		return quantidadeDeHoras;
	}

	public void setQuantidadeDeHoras(double quantidadeDeHoras) {
		this.quantidadeDeHoras = quantidadeDeHoras;
	}

	@Override
	public double calcularSalario() {
		return getValorHora() * getQuantidadeDeHoras();
	}
}
