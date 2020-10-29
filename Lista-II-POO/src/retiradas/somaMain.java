package retiradas;

import java.util.Scanner;

public class somaMain {

	public static void main(String[] args) {
		int n, soma=0, cont=0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Insira um número para a soma: ");
			n = scan.nextInt();
			if(soma+n<100) {
				soma+=n;
				cont++;
				System.out.println("Soma atual = " + soma + "\ncont = " + cont); //debug
			}
			else
				break;
		}
		while(soma<100);
		
		System.out.println("Soma = " + soma);
		System.out.println("Quantidade de números = " + cont);
		if(cont!=0)
			System.out.println("Média = " + soma/cont);
		
		scan.close();
	}

}

/* 7
 * 25
 * 10
 * 60
 */