package questao8;

import java.util.Scanner;

public class ProvaMain {

	public static void main(String[] args) {
		Gabarito g = new Gabarito();
		Scanner scan = new Scanner(System.in);
		int tamProva=15; double maior;
		
		g.setGabarito(tamProva); //inserir valores do gabarito
		
		Prova p1 = new Prova(g);
		Prova p2 = new Prova(g);
		
		//responder as provas
		p1.responderProva(tamProva);
		p2.responderProva(tamProva);
		
		p1.calcNota();
		p1.infoProva();
		p2.calcNota();
		p2.infoProva();
		
		maior = p1.maior(p2);
		System.out.println("Nota do maior: " + maior);
		maior = p2.maior(p1);
		System.out.println("Nota do maior: " + maior);
		
		scan.close();

	}

}
