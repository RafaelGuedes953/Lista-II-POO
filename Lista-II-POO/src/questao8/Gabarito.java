package questao8;

import java.util.ArrayList;
import java.util.Scanner;

public class Gabarito {
	ArrayList<Character> resp = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	
	public int getSize() {
		return resp.size();
	}
	
	public void setResp(char r) {
		resp.add(r);
	}
	
	public char getResp(int q) { //q = numero da questão
		return resp.get(q);
	}
	
	public void setGabarito(int tam) {
		char r;
		
		//índice 0 -> resposta da questão 1
		for(int i=0;i<tam;i++) {
			System.out.println("Digite o gabarito da questão [" + (i+1) + "]: ");
			r=scan.next().charAt(0);
			if(Character.isLetter(r)) //verifica se o que foi digitado é um char
				this.setResp(r);
			else
				i--;
			scan.nextLine();
		}
	}
	
	public char respostaQuestao(int numeroQuestao) {
		return resp.get(numeroQuestao);
	}
}

