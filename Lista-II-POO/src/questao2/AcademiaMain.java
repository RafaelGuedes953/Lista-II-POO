package questao2;

import java.util.Scanner;

public class AcademiaMain {
	
	public static void main(String[] args) {
		int op=-1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nome da academia: ");
		Academia acad = new Academia(scan.nextLine());
		
		while(op!=0) {
			op=acad.Menu();
		}
		
		scan.close();
	}

}
