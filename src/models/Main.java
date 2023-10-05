package models;


public class Main {

	public static void main(String[] args) {
		
		Pessoa washington = new Pessoa("Washington candido dos santos",12, "rua barão");
		FuncAdm ricardo = new FuncAdm("Ricardo alve",12, "rua barão",2000.0, "gerente","financeiro");
		Professor adriano = new Professor("Adriano silva",19,"rua silva",200.0,"ads");
		Funcionario fazTudo = new Funcionario("faço tudo",12,"moro logo ali",0.0);
		
		System.out.println(washington);
		System.out.println(ricardo);
		System.out.println(adriano);
		System.out.println(fazTudo);
		
		

		}

}