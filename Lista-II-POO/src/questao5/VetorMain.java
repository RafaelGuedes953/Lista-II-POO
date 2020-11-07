package questao5;

import java.util.Scanner;

public class VetorMain {

	public static void main(String[] args) {
		int i, tam=10, pos;
		int[] vector = new int[tam];
		Scanner scan = new Scanner(System.in);
		

		for(i=0;i<tam;i++) { //preenchendo vetor
			try {
				System.out.println("Digite a posi��o: ");
				pos = Integer.parseInt(scan.nextLine());
				System.out.println("Digite o n�mero: ");
				vector[pos] = Integer.parseInt(scan.nextLine());
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Vish, deu bronca aqui hein...");
				System.out.println("Esse n�o � um �ndice v�lido...");
				//e.printStackTrace();
				break;
			}
			catch(NumberFormatException e) {
				System.out.println("Vish, deu bronca aqui hein...");
				System.out.println("Entrada n�o � um n�mero...");
				//e.printStackTrace();
				break;
			}
			finally {
				scan.close();
			}
			
		}
		
		System.out.println("\n***** Valores inseridos no vetor *****\n");
		for(i=0;i<tam;i++)
			System.out.println("V["+i+"] = " + vector[i]);
		scan.close();
	}

}
