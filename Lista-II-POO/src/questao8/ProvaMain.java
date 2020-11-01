package questao8;

import java.util.Scanner;

public class ProvaMain {

	public static void main(String[] args) {
		Gabarito g = new Gabarito();
		Scanner scan = new Scanner(System.in);
		
		//índice 0 -> resposta da questão 1
		for(int i=0;i<15;i++) {
			System.out.println("Digite o valor para a questão " + i+1 + "a: ");
			g.setResp(scan.next().charAt(0)); //lê o primeiro char recebido do teclado
			scan.nextLine();
		}
		
		Prova p = new Prova(g);
		
		

	}

}
