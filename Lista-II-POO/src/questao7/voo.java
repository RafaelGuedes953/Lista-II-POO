package questao7;

import questao6.data;

public class voo {
	private data d;
	private int id, qtdPassageiros, tam=100;
	private int[] assentos, livres;
	
	//refazer utilizando ArrayList
	
	public voo(int id, int dia, int mes, int ano) { //construtor
		this.id = id;
		d = new data(dia, mes, ano);
		if (d.getDia()==1)
			System.out.println("Valor de data inválida inserida!!!");
		qtdPassageiros = 0;
		assentos = new int[tam];
		livres = new int[tam];
		for(int i=0;i<tam;i++) //preenche vetor dos assentos livres
			livres[i]=i+1; //número dos assentos começando de 1
	}
	
	public void setTamanho(int tam) {
		this.tam=tam;
	}
	
	public int getTamanho() {
		return tam;
	}
	
	public int getVoo() {
		return id;
	}
	
	public int getPassageiros() {
		return qtdPassageiros;
	}
	
	public void addPassageiro() {
		qtdPassageiros++;
	}
	
	private boolean verifica(int n) {
		for(int i=0;i<=getPassageiros();i++)
			if(assentos[i]==n)
				return false; //assento está ocupado
		return true; //assento liberado
	}
	
	public boolean ocupa(int nAssento) {
		if(verifica(nAssento) && getPassageiros()<100) {
			assentos[getPassageiros()]=nAssento;
			livres[nAssento]=0;
			addPassageiro();
			return true;
		}
		return false;
	}
	
	public int vagas() { //retorna o número de vagas disponíveis
		System.out.println("Quantidade de vagas disponíveis: " + (tam-qtdPassageiros));
		return tam-qtdPassageiros;
	}
	
	public int menor(int v[], int tam) {
		int men=v[0];
		
		for(int i=0;i<tam;i++) {
			if(v[i]!=0)
				return v[i];
		}
		
		return men;
	}
	
	public int proximoLivre() {
		return menor(livres, tam); //retorna o indice do primeiro assento disponível +1
	}

}
