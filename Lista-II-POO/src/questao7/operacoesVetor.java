package questao7;

//import java.util.Arrays;

public class operacoesVetor {

	public int menor(int v[], int tam) {
		int men=v[0];
		//Arrays.sort(v); //ordena o vetor do menor para o maior
		
		for(int i=0;i<tam;i++) {
			if(v[i]!=0)
				return v[i];
		}
		
		return men;
	}
}
