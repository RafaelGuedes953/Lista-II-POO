package questao1;

import java.util.Scanner;

public class Elevador {
	private int andares, andarAtual=0, capacidade, qtdPessoas=0;
	Scanner scan = new Scanner(System.in);
	
	public Elevador(int andares, int capacidade) { //inicializar
		setAndares(andares);
		setCapacidade(capacidade);
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
		 * se o parametro for 0 e não estiver cheio, acrescenta 1
		 * se for 1 e não estiver vazio, diminui 1
		 */
		if(coef==0 && (getQtdPessoas()<getCapacidade()))
			qtdPessoas+=1;
		else {
			if(coef==1 && (getQtdPessoas()>0))
				qtdPessoas-=1;
			else {
				if(getQtdPessoas()==getCapacidade())
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
		 * se o parametro for 0 e não estiver no último andar, acrescenta 1
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
		System.out.println("Quantidade atual = "+getQtdPessoas()+"\n");
		System.out.println("Capacidade = "+getCapacidade()+"\n");
	}
	
	public void sair() {
		setQtdPessoas(1);
		System.out.println("Quantidade atual = "+getQtdPessoas()+"\n");
		System.out.println("Capacidade = "+getCapacidade()+"\n");
	}
	
	public int menuElevador() {
		
		System.out.println("***** Menu Elevador *****");
		System.out.println("	1 - Entrar");
		System.out.println("	2 - Sair");
		System.out.println("	3 - Subir");
		System.out.println("	4 - Descer");
		System.out.println("	0 - Encerrar");
		System.out.println("*************************");
		System.out.println("\nDigite uma opção: ");
		int op = scan.nextInt();
		
		switch(op) {
			case 0:
				break;
			case 1:
				entrar();
				break;
			case 2:
				sair();
				break;
			case 3:
				subir();
				break;
			case 4:
				descer();
				break;
			default:
				menuElevador(); //opção digitada inválida	
		}
		return op;
	}

}
