package sistemadegerenciamentoescolar;

public class ProjetoEscola {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Professor p1 = new Professor("Juliano", 36);
		Professor p2 = new Professor("Dom João", 32);
		Disciplina d1 = new Disciplina("Biologia", 90, 50);
		Disciplina d2 = new Disciplina("Matemática", 100, 60);
		Aluno a1 = new Aluno("Diego", 15);
		Aluno a2 = new Aluno("Giovanna", 23);
		Funcionario f1 = new Funcionario("Otávio", 25);
		Gerente g1 = new Gerente("Juliana", 25);
		Gerente.proverAumentoSalarial(p2, 500);
		Gerente.proverAumentoSalarial(p2);
		p2.mostrarSalario();
		Gerente.demitirFuncionario(g1);
		Gerente.definirSetor(g1, "Zelador");
		g1.mostrarSetor();
		p2.mostrarSetor();
		a1.realizarAvaliacao(d2);
		a1.calcularMedia(d2);
	}
}
