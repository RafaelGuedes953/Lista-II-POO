package questao10;

public class Equipamento {
	private int[] valor;
	private int numeroEquipamentos;

	public Equipamento(int numeroEquipamentos) {
		if(numeroEquipamentos>0) {
			this.valor = new int[numeroEquipamentos];
			this.numeroEquipamentos = numeroEquipamentos;
		}
		else
			System.out.println("Quantidade de equipamentos igual a 0!");
		
	}
	
	public int getNumeroEquipamentos() {
		return numeroEquipamentos;
	}
	
	public int getValor(int ind) {
		return valor[ind];
	}
	
	public int[] getValorVetor() {
		return valor;
	}
	
	public void setValor(int ind, int valor) {
		this.valor[ind]=valor;
	}

}
