package models;



public class Aluno extends Pessoa {
	String semestre;
	String curso;
	
	public Aluno(String nome, Integer idade, String endereco, String semestre, String curso) {
		super(nome, idade, endereco);
		this.semestre = semestre;
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [semestre=" + semestre + ", curso=" + curso + "]";
	}
	

	
}
