package questao8;

import java.util.ArrayList;

public class Prova {
	private double nota;
	//lista de char que conterá as respostas do aluno
	ArrayList<Character> respostas = new ArrayList<>(); 
	Gabarito gab = new Gabarito();
	
	public Prova(Gabarito gab) { //método construtor
		this.gab=gab;
	}
	
	public void respostasAluno(char[] respostaQuestao) {
		
	}
	
	public void responderQ(char resp) {
		respostas.add(resp);
	}
	
	public void acertos() {
		
	}
	
	public void calcNota() {
		/* índice<10 -> nota+=0.5
		 * índice<10 -> nota+=1	*/
		
	}
	
	public void maior() {
		
	}

}
