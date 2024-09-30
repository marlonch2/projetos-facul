package sistemadegerenciamentoescolar;

public class Gerente extends Funcionario {

	public Gerente(String nome, int idade) {
		super(nome, idade);
	}
	
	public static void definirSetor(Funcionario a, String b) {
	    	if(a.ativo) {
	    	a.setSetor(b);
	    	System.out.println("Funcionário " + a.getNome()
	    	+ " definido para o setor: " + a.getSetor().toLowerCase());
	    	} else {
	    		System.out.println("Funcionário demitido...");
	    	}
		}

	public static void recontratarFuncionario(Funcionario a) {
		if(a.getClass().getSimpleName().equals("Gerente")) {
			System.out.println("Inválido.");
		} else {
			a.ativo = true;
		}
	}
	public static Funcionario contratarFuncionario(String nome, int idade) {
		Funcionario novofuncionario = new Funcionario(nome, idade);
		return novofuncionario;
	}
	public static void demitirFuncionario(Funcionario a) {
		if(a.getClass().getSimpleName().equals("Gerente")) {
			System.out.println("Inválido.");
		} else {
			a.ativo = false;
		}
	}
	public static void proverAumentoSalarial(Funcionario a, double salario) {
		if(a.getClass().getSimpleName().equals("Gerente")) {
			System.out.println("Inválido.");
		} else {
			if(salario > 0) {
				System.out.print("Salário de " + a.getNome() + " subiu de " + a.salario + " para ");
				a.salario += salario;
				System.out.println(a.salario);
			} else {
				System.out.println("Impossível o aumento salarial.");
			}

		}
	}
	public static void proverAumentoSalarial(Funcionario a) {
		if(a.getClass().getSimpleName().equals("Gerente")) {
			System.out.println("Inválido.");
	} else {
		a.salario += 100;
		System.out.println("Salário de " + a.getNome() + " aumentado.");
	}
	} 
}
