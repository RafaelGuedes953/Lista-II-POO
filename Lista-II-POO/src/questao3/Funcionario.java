package questao3;

public class Funcionario {
	private String nome, cpf, end;
	private int id;
	
	public Funcionario() {}
	
	public Funcionario(String nome, String cpf, int id) {
		this.nome = nome;
		this.cpf = cpf;
		this.id=id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public int getId() {
		return id;
	}

}
