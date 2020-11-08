package questao10;

import java.util.Scanner;

public class EquipamentoMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, mesC, op=1;
		
		System.out.println("Quantidade de equipamentos: ");
		num=scan.nextInt();
		System.out.println("Mês corrente: ");
		mesC=scan.nextInt();
		
		EquipamentoCorrigido equip = new EquipamentoCorrigido(num,mesC);
		
		while(op!=0) {
			op=equip.menu();
		}
			
		scan.close();

	}

}
