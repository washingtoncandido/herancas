package models;


public class FuncAdm extends Funcionario {
	protected String setor;
	protected String funcao;
	
	public FuncAdm(String nome, Integer idade, String endereco, Double salario, String setor, String funcao) {
		super(nome, idade, endereco, salario);
		this.setor = setor;
		this.funcao = funcao;
	}
	

	@Override
	public String toString() {
		return "FuncAdm [nome="+nome+ "idade"+ idade + "endereco"+endereco+ "setor=" + setor + ", funcao=" + funcao + "]";
	}
	
	@Override
	public String addReclamacao(String reclamacao) {
		
		return "reclamacao " + reclamacao  + getNome()+ getFuncao()+ " " ; 
	}
	
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getFuncao() {
		return funcao;
	}

	public  void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public int setFuncao(FuncAdm funcionario,String funcao) {
		if(funcionario.funcao.equalsIgnoreCase("gerente")) {
			if( funcionario.funcao.equalsIgnoreCase(funcao) ) {
				System.out.println("Não é possivel altera para a mesma função");
				return 1;
			}else {
				funcionario.funcao = funcao;
				System.out.println("função alterada com sucesso");
				return 1;
			}
		}else {
			System.out.println("você não tem permissão para altera a função");
			return 1;
		}
	}

	

	
	
}
