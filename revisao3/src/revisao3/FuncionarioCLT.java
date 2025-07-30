package revisao3;

public class FuncionarioCLT extends Funcionario{
	
	private double salarioBase;
	private double gratificacao;

	public FuncionarioCLT(String nome, int matricula, 
			double salarioBase, double gratificacao) {
		super(nome, matricula);
		this.salarioBase = salarioBase;
		this.gratificacao = gratificacao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}

	@Override
	public double calcularSalario() {
		return getSalarioBase() + getGratificacao();
	}
}
