package questao11;

public class Pluviometro {
	protected String tipo;
	private int peso, capacidade;
	//qual o peso e capacidade para qual tipo?
	
	public Pluviometro(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
}
