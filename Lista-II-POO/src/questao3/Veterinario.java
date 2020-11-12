package questao3;

import java.util.ArrayList;

public class Veterinario extends Funcionario {
	private String crmv;
	ArrayList<String> exame = new ArrayList<>();

	public Veterinario(String nome, String cpf, String crmv, int id) {
		super(nome, cpf, id);
		setCrmv(crmv);
	}
	
	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}
	
	public String getCrmv() {
		return crmv;
	}
	
	public void solicitarExame(String exam){
        exame.add(exam);
    }
	
	public void exibirExamesSol(){
        System.out.println("\nExames Solicitados\n");
        for(int i=0;i<exame.size();i++)
            System.out.println(i + " - " + exame.get(i));
    }
}
