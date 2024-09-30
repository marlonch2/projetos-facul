package sistemadegerenciamentoescolar;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario { 

	private int quantmaterias;
	
	List<Object> materias = new ArrayList<>();
	
	public Professor(String nome, int idade) {
		super(nome, idade);
		this.quantmaterias = 0;
		this.ativo = true;
		this.salario = 3000;
		this.setor = "Professor";
	}
    public void adicionarDisciplina(Disciplina a) {
    	if(ativo) {
    	if(a.professoresassociados.contains(a.getProfessorassociado()) == false) {
    	a.professoresassociados.add(this.getNome());
    	a.setProfessorassociado(getNome());
		this.quantmaterias++;
		materias.add(a.getNome());
		materias.add(a.getCargahoraria());
    	System.out.println(a.getNome() + " adicionada.");
    	} else {
    		System.out.println("Já existe um professor nessa disciplina...");
    	}
    	} else {
    		System.out.println("Professor demitido...");
    	}
    }
    public void removerDisciplina(Disciplina a) {
    	if(ativo) {
    	if(quantmaterias > 0) {
    		this.quantmaterias--;
    		a.setProfessorassociado(null);
    		a.professoresassociados.remove(this.getNome());
    		materias.remove((Object)a.getNome());
    		materias.remove((Object)a.getCargahoraria());
    		System.out.println(a.getNome() + " removida.");
    		} else {
    			System.out.println("Impossível remover.");
    		}
    	} else {
    		System.out.println("Professor demitido...");
    	}
    }
    public void verificarCargaHoraria() {
    	if(ativo) {
    	System.out.println("Quantidade de matérias do professor " + this.getNome()
    	+ ": " + this.quantmaterias);
    	if(materias.size() > 0) {
         for(Object a: materias) {
        	 if(a instanceof String) {
        		 System.out.print("Matéria: " + (String) a);
        	 }
        	 else if(a instanceof Integer) {
        		 System.out.println(" - Carga horária: " + (Integer) a + "h");
        	 } else {
        		 System.out.println("Não há matérias.");
        	}

        	 }
         }
    	} else {
    		System.out.println("Professor demitido...");
    	}
        }
    	
	public int getMaterias() {
		return quantmaterias;
	}
	public void setMaterias(int materias) {
		this.quantmaterias = materias;
	}
	public int getQuantmaterias() {
		return quantmaterias;
	}
	public void setQuantmaterias(int quantmaterias) {
		this.quantmaterias = quantmaterias;
	}
	
    
}
