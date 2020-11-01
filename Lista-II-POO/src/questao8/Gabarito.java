package questao8;

import java.util.ArrayList;

public class Gabarito {
	ArrayList<Character> resp = new ArrayList<>();
	
	public int getSize() {
		return resp.size();
	}
	
	public void setResp(char r) {
		resp.add(r);
	}
	
	public char getResp(int q) { //q = numero da questão
		return resp.get(q);
	}
	
	public char respostaQuestao(int numeroQuestao) {
		return resp.get(numeroQuestao);
	}
}

