package questao9;

import questao7.voo;

public class VooDivisao extends voo{
	private int fumantes;

	public VooDivisao(int id, int dia, int mes, int ano, int vagas, int fuma) {
		super(id, dia, mes, ano);
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
