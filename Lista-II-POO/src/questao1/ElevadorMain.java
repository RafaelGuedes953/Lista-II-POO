package questao1;

import java.util.Scanner;

public class ElevadorMain {

	public static void main(String[] args) {
		int capacidade, andares, op=1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a capacidade do elevador: ");
		capacidade = scan.nextInt();
		System.out.println("Digite o número de andares do prédio: ");
		andares = scan.nextInt();
		
		Elevador e = new Elevador(andares, capacidade);
		
		//do {e.menuElevador();} while(e.menuElevador()!=0);
		
		while(op!=0)
			op = e.menuElevador();
		
		System.out.println("Menu finalizado!\n");
		
		scan.close();
	}

}
