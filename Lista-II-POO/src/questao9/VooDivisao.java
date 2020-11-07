package questao9;

import questao7.Voo;

public class VooDivisao extends Voo{
	private int fumantes;

	public VooDivisao(int dia, int mes, int ano, int vagas, int fuma) {
		super(dia, mes, ano);
		super.setTamanho(vagas);
		fumantes=fuma;
	}
	
	public int maxVagas() {
		return getTamanho();
	}
	
	public void cadeiraFumantes() {
		
	}
	
	public void tipo(int c) {
		
	}

}
