package sistemadegerenciamentoescolar;

public class Funcionario extends Pessoa {

	protected boolean ativo;
	protected double salario;
	protected String setor;
	
	public Funcionario(String nome, int idade) {
		super(nome, idade);
		this.ativo = true;
		this.salario = 1500;
		this.setor = "Sem setor definido";
	}
	public void mostrarSalario() {
		if(ativo) {
			System.out.println("O salário de " + this.getNome() + " é: " + this.salario);
		} else {
			System.out.println("Funcionário demitido...");
		}
	} 
	public void mostrarSetor() {
		if(ativo) {
			System.out.println("O setor de " + this.getNome() + " é: " + this.setor);
		} else {
			System.out.println("Funcionário demitido...");
		}
	}
    
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
    
}
