package retiradas;

import questao6.Data;

public class voo {
	private Data d;
	private int id, qtdPassageiros, tam=100;
	private int[] assentos, livres;
	//contador de inst�ncias da classe, utilizado para atribuir n�mero do voo
	public static int contVoo=0; 
	
	//refazer utilizando ArrayList
	
	public voo(int id, int dia, int mes, int ano) { //construtor
		this.id = contVoo;
		contVoo++;
		d = new Data(dia, mes, ano);
		if (d.getAno()==1)
			System.out.println("Valor de data inv�lida inserida!!!");
		qtdPassageiros = 0;
		assentos = new int[tam];
		livres = new int[tam];
		for(int i=0;i<tam;i++) //preenche vetor dos assentos livres
			livres[i]=i+1; //n�mero dos assentos come�ando de 1
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
				return false; //assento est� ocupado
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
	
	public int vagas() { //retorna o n�mero de vagas dispon�veis
		System.out.println("Quantidade de vagas dispon�veis: " + (tam-qtdPassageiros));
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
		return menor(livres, tam); //retorna o indice do primeiro assento dispon�vel +1
	}

}
