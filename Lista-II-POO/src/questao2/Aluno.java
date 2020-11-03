package questao2;

import java.util.ArrayList;

public class Aluno {
	private String cpf, nome;
	private int profId;
	ArrayList<String> exerc = new ArrayList<>();
	
	public Aluno(String cpf, String nome) {
		setCpf(cpf);
		setNome(nome);
		setProfId(-1); //nenhum professor atribuído
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getProfId() {
		return profId;
	}
	
	public void setProfId(int profId) {
		this.profId=profId;
	}

	public ArrayList<String> getExerc() {
		return exerc;
	}
	
	public void mostraExerc() {
		System.out.println("**** Exercícios ****");
		for(int i=0;i<exerc.size();i++)
			System.out.println("["+i+"] -> "+exerc.get(i));
	}

	public void setExerc(String exerc) {
		this.exerc.add(exerc);

		//e = new ArrayList<>();
	}
	
	public void atribuiProf(int profId) {
		this.profId = profId; //índice referente ao professor responsável
	}

}
