package retiradas;

import java.util.Scanner;

import questao4.ExcecaoAcimaDeCem;

public class somaMainException {

	public static void main(String[] args) throws ExcecaoAcimaDeCem {
		int soma=0, cont=0, n;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Insira um número para a soma: ");
			n = scan.nextInt();
			if(soma+n>100) {
				scan.close();
				throw new ExcecaoAcimaDeCem(soma,cont);
			}
			else {
				soma+=n;
				cont++;
			}
		}
		while(soma<100);
		
		scan.close();
	}

}
