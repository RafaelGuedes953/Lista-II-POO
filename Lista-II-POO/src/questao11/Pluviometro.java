package questao11;

import java.util.Random;

public class Pluviometro {
	Random geraN = new Random();
	protected String tipo;
	private int peso, capacidade; //peso indicado pelo usuário ao instanciar a classe
	//capacidade em milímetros
	
	public Pluviometro(String tipo, int peso) {
		this.tipo = tipo;
		setPeso(peso);
		setCapacidade();
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade() {
		this.capacidade = geraN.nextInt(15)*100+5;
		//System.out.println("Número gerado: " + capacidade); //debug
	}
}
