package sistemadegerenciamentoescolar;

public abstract class Pessoa {

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	private String nome;
	private int idade;
	
	public void fazerAniver() {
		System.out.print("Idade de " + this.getNome() + " saiu de"
				+ " " + this.idade + " para ");
		this.idade++;
		System.out.println(this.idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
