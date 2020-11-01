package questao8;

import java.util.Scanner;

public class ProvaMain {

	public static void main(String[] args) {
		Gabarito g = new Gabarito();
		Scanner scan = new Scanner(System.in);
		int tamProva=15; char r;
		
		//índice 0 -> resposta da questão 1
		for(int i=0;i<tamProva;i++) {
			System.out.println("Digite o valor para a questão " + (i+1) + ": ");
			r=scan.next().charAt(0);
			if(Character.isLetter(r)) //verifica se o que foi digitado é um char
				g.setResp(r);
			else
				i--;
			scan.nextLine();
		}
		
		Prova p1 = new Prova(g);
		Prova p2 = new Prova(g);
		
		//responder a prova
		for(int i=0;i<tamProva;i++) {
			System.out.println("Digite a resposta para a questão " + (i+1) + ": ");
			p1.responderQ(scan.next().charAt(0)); //lê o primeiro char recebido do teclado
			scan.nextLine();
		}
		
		p1.calcNota();
		p1.infoProva();
		p2.calcNota();
		p2.infoProva();
		
		scan.close();

	}

}
