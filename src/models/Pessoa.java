package models;
public class Pessoa {
	String nome;
	int idade;
	String endereco;
	
	
	public Pessoa(String nome, int idade, String endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
	}
	
	
}