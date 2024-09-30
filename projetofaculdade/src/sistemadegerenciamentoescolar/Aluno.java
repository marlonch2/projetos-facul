package sistemadegerenciamentoescolar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aluno extends Pessoa {
	
	private int quantmaterias;
	private double notatotal = 0;
	
	List<String> materias = new ArrayList<>();

	public Aluno(String nome, int idade) {
		super(nome, idade);
	}

	public void realizarAvaliacao(Disciplina a) {
		Random b = new Random();
		double nota = b.nextDouble(11);
		if(nota > 10) {
			nota = 10;
		}
		double notacortada = Math.floor(nota * 10) / 10;
		System.out.println("O aluno " + this.getNome() +
				" tirou nota " + notacortada + " na disciplina "
				+ a.getNome().toLowerCase() + "(AV1)");
		
		Random c = new Random();
		double nota2 = c.nextDouble(11);
		if(nota2 > 10) {
			nota2 = 10;
		}
		double notacortada2 = Math.floor(nota2 * 10) / 10;
		System.out.println("O aluno " + this.getNome() +
				" tirou nota " + notacortada2 + " na disciplina " +
				a.getNome().toLowerCase() + "(AV2)");
		
		this.notatotal += notacortada + notacortada2;
		
	}
	public boolean calcularMedia(Disciplina a) {
		double media = this.notatotal / 2;
		if(this.notatotal == 0 || this.notatotal < 0) {
			System.out.println("Não é possível calcular média do aluno " + this.getNome());
			return false;
		} else {
			System.out.printf("A média do aluno " + this.getNome() + " é " +
		"%.1f" + " em " + a.getNome().toLowerCase() + "\n", media);
			return true;
		}
	}
	
	public boolean adicionarDisciplina(Disciplina a) {
		a.setQuantidade(a.getQuantidade() + 1);
		if(a.getQuantidademax() < a.getQuantidade()) {
			System.out.println("Essa disciplina já esta lotada.");
			a.setQuantidade(a.getQuantidade() - 1);
			return false;
		} else {
			a.alunosassociados.add(this.getNome());
			this.quantmaterias++;
			materias.add(a.getNome());
			System.out.println(a.getNome() + " adicionada.");
			return true;
		}
		
	}
	
	public boolean removerDisciplina(Disciplina a) {
		if(this.quantmaterias == 0 || this.quantmaterias < 0) {
			System.out.println("Não há disciplina adicionada.");
			return false;
		}
			if(a.alunosassociados.contains(this.getNome()) == false) {
				System.out.println("O aluno não adicionou essa disciplina.");
				return false;
			} else {
				a.alunosassociados.remove(this.getNome());
				this.quantmaterias--;
				materias.remove(a.getNome());
				System.out.println("Disciplina removida.");
				return true;
			}
		}
	public void mostrarDisciplinas() {
		if(materias.size() > 0) {
			for(String a: materias) {
				System.out.println("Quantidade de disciplinas do aluno " + 
			this.getNome() + ": " + this.quantmaterias);
			System.out.println("Disciplinas: " + a);
		}
			
		}
	}
	public double getNotatotal() {
		return notatotal;
	}

	public void setNotatotal(double notatotal) {
		this.notatotal = notatotal;
	}

	public int getQuantmaterias() {
		return quantmaterias;
	}

	public void setQuantmaterias(int quantmaterias) {
		this.quantmaterias = quantmaterias;
	}
	
}
