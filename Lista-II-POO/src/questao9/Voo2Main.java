package questao9;

import java.util.Scanner;

public class Voo2Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dia, mes, ano, vagas, fumam, op;
		
		System.out.println("Digite o dia do Voo: ");
		dia = scan.nextInt();
		System.out.println("Digite o mês do Voo: ");
		mes = scan.nextInt();
		System.out.println("Digite o ano do Voo: ");
		ano = scan.nextInt();
		System.out.println("Digite quantidade de vagas: ");
		vagas = scan.nextInt();
		System.out.println("Digite quantidade de fumantes: ");
		fumam = scan.nextInt();
		
		VooDivisao v = new VooDivisao(dia, mes, ano, vagas, fumam);
		
		do
			op = v.menuVoo(); 
		while(op!=0);
		
		scan.close();
	}

}
