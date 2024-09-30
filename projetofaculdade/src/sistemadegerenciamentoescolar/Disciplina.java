package sistemadegerenciamentoescolar;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

	private int cargahoraria;
	private String nome;
	private String professorassociado;
	private int quantidademax;
	private int quantidade;
	
	List<String> professoresassociados = new ArrayList<>();
	List<String> alunosassociados = new ArrayList<>();
	
	public Disciplina(String nome, int cargahoraria, int quantidademax) {
		this.cargahoraria = cargahoraria;
		this.nome = nome;
		this.quantidademax = quantidademax;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargahoraria() {
		return cargahoraria;
	}

	public void setCargahoraria(int cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

	public String getProfessorassociado() {
		return professorassociado;
	}
	public void setProfessorassociado(String professorassociado) {
		this.professorassociado = professorassociado;
	}
	public int getQuantidademax() {
		return quantidademax;
	}
	public void setQuantidademax(int quantidademax) {
		this.quantidademax = quantidademax;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
