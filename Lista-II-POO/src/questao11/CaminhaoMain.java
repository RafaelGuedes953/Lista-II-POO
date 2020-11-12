package questao11;

import java.util.Scanner;

public class CaminhaoMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int e, op;
		
		System.out.println("Limite de equipamentos: ");
		e=scan.nextInt();
		
		CaminhaoAlfa camiA = new CaminhaoAlfa(e);
		
		do {
			op=camiA.menu();
		} while(op!=0);
		
		CaminhaoBeta camiB = new CaminhaoBeta(e);
		
		do {
			op=camiB.menu();
		} while(op!=0);
		
		scan.close();
	}

}
