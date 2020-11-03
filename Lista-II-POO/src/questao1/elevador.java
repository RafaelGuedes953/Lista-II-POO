package questao1;

public class elevador {
	private int andares, andarAtual, capacidade, qtdPessoas;
	
	public elevador(int andares, int capacidade) { //inicializar
		setAndares(andares);
		setCapacidade(capacidade);
		setQtdPessoas(0);
		setAndarAtual(0);
	}

	public int getAndares() {
		return andares;
	}

	public void setAndares(int andares) {
		this.andares = andares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int coef) {
		/* coef -> coeficiente
		 * se o parametro for 0 e ñ estiver cheio, acrescenta 1
		 * se for 1 e ñ estiver vazio, diminui 1
		 */
		if(coef==0 && (getQtdPessoas()<getCapacidade()))
			qtdPessoas+=1;
		else {
			if(coef==1 && (getQtdPessoas()>0))
				qtdPessoas-=1;
			else {
				if(getAndarAtual()==getCapacidade())
					System.out.println("Elevador cheio!\n");
				else
					System.out.println("Elevador vazio!\n");
			}	
		}
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int coef) {
		/* coef -> coeficiente
		 * se o parametro for 0 e ñ estiver no último andar, acrescenta 1
		 * se for 1, diminui 1
		 */
		if(coef==0 && (getAndarAtual()<getAndares()))
			andarAtual+=1;
		else {
			if(coef==1 && (getAndarAtual()>0))
				andarAtual-=1;
			else {
				if(getAndarAtual()==getAndares())
					System.out.println("Último andar alcançado!\n");
				else
					System.out.println("Térreo alcançado!\n");
			}
		}	
	}
	
	public void subir() {
		setAndarAtual(0);
		System.out.println("Andar atual = "+getAndarAtual()+"\n");
		System.out.println("Último andar = "+getAndares()+"\n");
	}
	
	public void descer() {
		setAndarAtual(1);
		System.out.println("Andar atual = "+getAndarAtual()+"\n");
		System.out.println("Último andar = "+getAndares()+"\n");
	}
	
	public void entrar() {
		setQtdPessoas(0);
	}
	
	public void sair() {
		setQtdPessoas(1);
	}

}
