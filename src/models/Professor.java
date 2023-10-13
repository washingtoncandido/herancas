package models;

public class Professor extends Funcionario {
	protected String disciplina;

	public Professor(String nome, Integer idade, String endereco, Double salario, String disciplina) {
		super(nome, idade, endereco, salario);
		this.disciplina = disciplina;
	}


	@Override
	public String toString() {
		return "Professor [nome="+nome+ "idade"+ idade + "endereco"+endereco+ "disciplina=" + disciplina+ "]";

	}

	public String getDisciplina() {
		return disciplina;
	}



	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
	
}
