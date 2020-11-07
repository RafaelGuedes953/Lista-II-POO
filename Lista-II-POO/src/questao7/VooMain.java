package questao7;

import java.util.Scanner;

public class VooMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dia, mes, ano, op;
		
		System.out.println("Digite o dia do Voo: ");
		dia = scan.nextInt();
		System.out.println("Digite o mês do Voo: ");
		mes = scan.nextInt();
		System.out.println("Digite o ano do Voo: ");
		ano = scan.nextInt();
		
		Voo v = new Voo(dia,mes,ano);
		
		do
			op = v.menuVoo(); 
		while(op!=0);
			
		scan.close();
	}

}
