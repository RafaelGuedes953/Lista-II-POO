package questao11;

import java.util.ArrayList;
import java.util.Scanner;

public class Caminhao {
	ArrayList<Pluviometro> pluvio;
	Scanner scan = new Scanner(System.in);
	Scanner string = new Scanner(System.in);
	private int pesoAtual=0, qtdEquip;
	
	public Caminhao(int qtdEquip) {
		pluvio = new ArrayList<>();
		setQtdEquip(qtdEquip);
	}
	
	public int getQtdEquip() {
		return qtdEquip;
		//limite da quantidade de equipamentos
	}

	public void setQtdEquip(int qtdEquip) {
		this.qtdEquip = qtdEquip;
	}

	public int getPesoAtual() {
		return pesoAtual;
	}
	
	public void setPesoAtual(int peso) {
		this.pesoAtual+=peso;
		//guarda peso somado dos pluvio inseridos
	}

	public String inserePluviometro(Pluviometro p) {
		return "Base";
	}
	
	public void mostrarListaPluvio() {
		if(pluvio.size()>0)
			for (int i=0;i<pluvio.size();i++) {
				System.out.println("["+i+"] = "+pluvio.get(i).getTipo());
				System.out.println("	Limite: "+pluvio.get(i).getCapacidade());
				System.out.println("	Peso: "+pluvio.get(i).getPeso());
			}
		else
			System.out.println("Nenhum pluvio encontrado!");
	}
	
	public void mostraDados() {
		
	}
	
	public int menu() {
		int op, p;
		String t;
		
		System.out.println("********** Menu **********");
		System.out.println("*	1 - Adicionar pluvio");
		System.out.println("*	2 - Mostrar pluvios");
		System.out.println("*	3 - Mostrar dados");
		System.out.println("*	0 - Encerrar");
		System.out.println("**************************");
		System.out.println("\nDigite uma opção: ");
		op = scan.nextInt();
		
		switch(op) {
			case 0:
				System.out.println("Menu finalizado!");
				break;
			case 1:
				System.out.println("Dados do pluvio\nTipo: ");
				t = string.nextLine();
				System.out.println("Peso: ");
				p = scan.nextInt();
				Pluviometro novo = new Pluviometro(t,p);
				System.out.println(inserePluviometro(novo));
				break;
			case 2:
				mostrarListaPluvio();
				break;
			case 3:
				mostraDados();
				break;
			default:
				System.out.println("Inválido!");
		}
		return op;
	}

}
