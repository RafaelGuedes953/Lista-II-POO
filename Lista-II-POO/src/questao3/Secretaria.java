package questao3;

public class Secretaria extends Funcionario {
	private String forma;

	public Secretaria(String nome, String cpf, String end, String tel, String forma) {
		super(nome, cpf, end, tel);
		setFormacao(forma);
	}
	
	public void setFormacao(String forma) {
		this.forma = forma;
	}
	
}
