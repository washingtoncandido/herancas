package models;


public class FuncAdm extends Funcionario {
	String setor;
	String funcao;
	
	public FuncAdm(String nome, Integer idade, String endereco, Double salario, String setor, String funcao) {
		super(nome, idade, endereco, salario);
		this.setor = setor;
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "FuncAdm [nome="+nome+ "idade"+ idade + "endereco"+endereco+ "setor=" + setor + ", funcao=" + funcao + "]";
	}

	

	
	
}
