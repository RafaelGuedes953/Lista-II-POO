package questao8;

import java.util.ArrayList;
import java.util.Scanner;

public class Prova {
	private double nota;
	private int acertos;
	//lista de char que conter� as respostas do aluno
	ArrayList<Character> respostas = new ArrayList<>(); 
	Gabarito gab = new Gabarito();
	Scanner scan = new Scanner(System.in);
	
	public Prova(Gabarito gab) { //m�todo construtor
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
	
	public void responderProva(int tam) {
		char r;
		
		//�ndice 0 -> resposta da quest�o 1
		for(int i=0;i<tam;i++) {
			System.out.println("Digite a resposta para a quest�o [" + (i+1) + "]: ");
			this.responderQ(scan.next().charAt(0)); //l� o primeiro char recebido do teclado
			r=scan.next().charAt(0);
			if(Character.isLetter(r)) //verifica se o que foi digitado � um char
				this.responderQ(r);
			else
				i--;
			scan.nextLine();
		}
	}
	
	private void calcAcertos() {
		/* �ndice<10 -> nota+=0.5
		 * �ndice<10 -> nota+=1	*/
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
		//System.out.println("\n\nTamanho: " + gab.getSize()); //debug -> retorna tamanho da lista
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
