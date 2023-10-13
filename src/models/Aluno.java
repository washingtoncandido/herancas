package models;



public class Aluno extends Pessoa {
	protected String semestre;
	protected String curso;
	
	public Aluno(String nome, Integer idade, String endereco, String semestre, String curso) {
		super(nome, idade, endereco);
		this.semestre = semestre;
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [semestre=" + semestre + ", curso=" + curso + "]";
	}
	
	

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	

	
}
