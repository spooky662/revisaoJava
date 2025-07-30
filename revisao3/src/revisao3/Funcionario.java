package revisao3;

public abstract class Funcionario {
	
	private String nome;
	private int matricula;
	
	public Funcionario(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public abstract double calcularSalario();
	
	public void exibirDados() {
		System.out.println("Funcionario: " + getNome() + ", Matricula: " + getMatricula() + ", Salario: " + calcularSalario());
	}
}
