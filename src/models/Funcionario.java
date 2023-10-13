package models;


public class Funcionario  extends Pessoa{
	protected Double salario;

	public Funcionario(String nome, int idade, String endereco, Double salario) {
		super(nome, idade, endereco);
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Funcionarios [Funcionario="+nome+ "idade"+ idade + "endereco"+endereco+ "Salario =" + salario+ "]";

	}
	public String addReclamacao(String reclamacao) {
		return reclamacao + getNome();
	}
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}