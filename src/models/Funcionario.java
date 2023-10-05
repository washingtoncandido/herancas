package models;


public class Funcionario  extends Pessoa{
	Double salario;

	public Funcionario(String nome, int idade, String endereco, Double salario) {
		super(nome, idade, endereco);
		this.salario = salario;
	}

	

	@Override
	public String toString() {
		return "Funcionarios [Funcionario="+nome+ "idade"+ idade + "endereco"+endereco+ "Salario =" + salario+ "]";

	}
	
}