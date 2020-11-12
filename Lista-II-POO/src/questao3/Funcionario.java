package questao3;

public class Funcionario {
	private String nome, cpf, end, tel;
	private static int id=101;
	
	public Funcionario(String nome, String cpf, String end, String tel) {
		this.nome = nome;
		this.cpf = cpf;
		this.end = end;
		this.tel = tel;
		id++;
	}
	
	public int getId() {
		return id;
	}

	public Funcionario() {}
	
	
}
