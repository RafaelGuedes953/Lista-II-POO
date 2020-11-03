package questao10;

import java.util.Scanner;

public class EquipamentoCorrigido extends Equipamento{
	private int mesCorrente;
	private int[] mesCompra;
	Scanner scan = new Scanner(System.in);

	public EquipamentoCorrigido(int numeroEquipamentos, int mesCorrente) {
		super(numeroEquipamentos);
		setMesCorrente(mesCorrente);
		mesCompra = new int[numeroEquipamentos];
	}

	public int getMesCorrente() {
		return mesCorrente;
	}

	public void setMesCorrente(int mesCorrente) {
		if(mesCorrente>0 && mesCorrente<=12)
			this.mesCorrente = mesCorrente;
		else
			System.out.println("Mês inválido!");
	}
	
	public void addMesCorrente() {
		mesCorrente++;
	}

	public int getMesCompra(int ind) {
		try {
			return mesCompra[ind];
		}
		catch(Exception e) {
			System.out.println("Entrada inválida!");
			return -1;
		}
	}

	public void setMesCompra(int ind, int mesCompra) {
		try {
			this.mesCompra[ind] = mesCompra;
		}
		catch(Exception e) {
			System.out.println("Entrada inválida!");
		}
	}
	
	public void corrige(int perc) {
		int calc=0, val=0;
		
		for(int i=0;i<this.getNumeroEquipamentos();i++) {
			if(getMesCompra(i)==getMesCorrente()) {
				val=this.getValor(i);
				calc=val+(val*perc/100);
				setValor(i, calc);
				if(getMesCorrente()<12)
					addMesCorrente();
				else
					setMesCorrente(1);
			}
		}
	}
	
	public void substitui(EquipamentoCorrigido novo) {
		if(this.getNumeroEquipamentos()==novo.getNumeroEquipamentos()) {
			for(int i=0;i<getNumeroEquipamentos();i++) {
				this.setValor(i,novo.getValor(i));
				this.setMesCompra(i,novo.getMesCompra(i));
			}
			this.setMesCorrente(novo.getMesCorrente());
		}
		else
			System.out.println("Objetos não possuem o mesmo tamanho!");
	}
	
	//adicionar aos vetores
	public void addEquipamento() {
		int ind, valor, mesCompra;
		System.out.println("Índice: ");
		ind=scan.nextInt();
		System.out.println("Valor: ");
		valor=scan.nextInt();
		System.out.println("Mês compra: ");
		mesCompra=scan.nextInt();
		
		this.setMesCompra(ind, mesCompra);
		this.setValor(ind, valor);
	}
	
	public void mostraInfo() {
		System.out.println("********** Valores *********");
		for(int i=0;i<this.getNumeroEquipamentos();i++) {
			if(this.getValor(i)!=0)
				System.out.println("pos ["+i+"] -> Valor="+this.getValor(i)+", Mês ->"+this.getMesCompra(i));
			
		}
		System.out.println("****************************");
	}
	
	public int menu() {
		System.out.println("***** Menu Equipamento *****");
		System.out.println("	1 - Adicionar equipamento");
		System.out.println("	2 - Corrigir valores");
		System.out.println("	3 - Mostrar valores");
		System.out.println("****************************");
		System.out.println("\nEscolha uma opção: ");
		int op=scan.nextInt();
		
		switch(op) {
			case 0:
				System.out.println("Menu finalizado!");
				break;
			case 1:
				this.addEquipamento();
				break;
			case 2:
				System.out.println("Digite o percentual de correção: ");
				this.corrige(scan.nextInt());
				break;
			case 3:
				mostraInfo();
				break;
			default:
				System.out.println("Digite uma opção válida!");
				menu();
		}
		
		return op;
	}

}
