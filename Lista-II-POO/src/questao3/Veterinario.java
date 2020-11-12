package questao3;

public class Veterinario extends Funcionario {
	private String crmv;

	public Veterinario(String nome, String cpf, String end, String tel, String crmv) {
		super(nome, cpf, end, tel);
		setCrmv(crmv);
	}
	
	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}
	
	
}
