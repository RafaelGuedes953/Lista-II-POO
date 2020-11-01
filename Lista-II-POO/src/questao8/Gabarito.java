package questao8;

import java.util.ArrayList;

public class Gabarito {
	ArrayList<Character> resp = new ArrayList<>();
	
	public void setResp(char r) {
		resp.add(r);
	}
	
	public char respostaQuestao(int numeroQuestao) {
		return resp.get(numeroQuestao);
	}
}

