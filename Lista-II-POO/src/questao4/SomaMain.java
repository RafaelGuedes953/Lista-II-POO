package questao4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SomaMain {

	public static void main(String[] args) throws ExcecaoAcimaDeCem {
		int soma=0, cont=0, n;
		Scanner scan = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Insira um número para a soma: ");
				n = scan.nextInt();
				if (soma+n>100)
					throw new ExcecaoAcimaDeCem(soma,cont); //lança a exception criada
				soma+=n;
				cont++;
			}
			catch(ArithmeticException | ExcecaoAcimaDeCem | InputMismatchException e){
				System.out.println("Vish, deu bronca aqui hein...");
				e.printStackTrace(); //exibir desc do erro
				break;
			}
			
		}
		while(soma<100);
		
		scan.close();

	}

}
