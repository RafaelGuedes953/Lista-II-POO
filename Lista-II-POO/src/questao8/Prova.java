package questao8;

import java.util.ArrayList;

public class Prova {
	private double nota;
	private int acertos;
	//lista de char que conterá as respostas do aluno
	ArrayList<Character> respostas = new ArrayList<>(); 
	Gabarito gab = new Gabarito();
	
	public Prova(Gabarito gab) { //método construtor
		this.gab=gab;
		nota=0;
		acertos=0;
	}
	
	public double getNota() {
		return nota;
	}

	public int getAcertos() {
		return acertos;
	}
	
	public void responderQ(char resp) { //respostasAluno()
		respostas.add(resp);
	}
	
	private void calcAcertos() {
		/* índice<10 -> nota+=0.5
		 * índice<10 -> nota+=1	*/
		for(int i=0;i<15;i++) {
			if(respostas.get(i)==gab.respostaQuestao(i)) {
				acertos++;
				if(i<10)
					nota+=0.5;
				else
					nota++;
			}
		}
	}
	
	public void infoProva() {
		int i;
		/* gabarito, respostas, acertos, nota */
		System.out.println("\nGabarito: ");
		for(i=0;i<gab.getSize();i++)
			System.out.print("["+(i+1)+"] - "+gab.getResp(i)+", ");
		
		System.out.println("\nRespostas: ");
		for(i=0;i<gab.getSize();i++)
			System.out.print("["+(i+1)+"] - "+respostas.get(i)+", ");
		
		System.out.println("\nAcertos: "+getAcertos());
		System.out.println("\nNota: "+getNota());
		//debug -> retorna tamanho da lista
		System.out.println("\n\nTamanho: " + gab.getSize());
	}

	public void calcNota() {
		calcAcertos();
	}
	
	public double maior(Prova conc) {
		if(this.getAcertos()==conc.getAcertos()) {
			if((this.getNota()==conc.getNota()) || (this.getNota()>conc.getNota()))
				return this.getNota();
			else
				return conc.getNota();
		}
		else {
			if(this.getAcertos()>conc.getAcertos())
				return this.getNota();
			else
				return conc.getNota();
		}
	}

}
