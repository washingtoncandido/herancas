package models;

public class Professor extends Funcionario {
	String disciplina;

	

	public Professor(String nome, Integer idade, String endereco, Double salario, String disciplina) {
		super(nome, idade, endereco, salario);
		this.disciplina = disciplina;
	}



	@Override
	public String toString() {
		return "Professor [nome="+nome+ "idade"+ idade + "endereco"+endereco+ "disciplina=" + disciplina+ "]";

	}
	
	
}
