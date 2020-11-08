package questao9;

import questao7.Voo;
import java.util.ArrayList;

public class VooDivisao extends Voo{
	private int fumantes;
	ArrayList<Boolean> tipo; //lista as cadeiras que são fumantes e não fumantes

	public VooDivisao(int dia, int mes, int ano, int vagas, int fuma) {
		super(dia, mes, ano, vagas);
		//this.setTamanho(vagas);
		setFumantes(fuma);
		tipo = new ArrayList<>();
		cadeiraFumantes();
	}
	
	public void setFumantes(int fumantes) {
		this.fumantes = fumantes;
	}
	
	public int getFumantes() {
		return fumantes;
	}
	
	public int maxVagas() {
		return getTamanho();
	}
	
	public void cadeiraFumantes() { //setTipo()
		int tam = this.getTamanho();
		for(int i=0;i<tam;i++) {
			if(i<tam-getFumantes())
				tipo.add(false);
			else
				tipo.add(true);
		}
	}
	
	public boolean tipo(int c) {
		return tipo.get(c);
	}
	
	@Override
	public int menuVoo() {
		int n;
		
		System.out.println("***** Menu Elevador *****");
		System.out.println("	1 - Adicionar passageiro");
		System.out.println("	2 - Ver número de vagas");
		System.out.println("	3 - Próximo assento livre");
		System.out.println("	4 - Número do voo");
		System.out.println("	5 - Ver data do voo");
		System.out.println("	6 - Quantidade de fumantes");
		System.out.println("	7 - Verifica tipo do assento");
		System.out.println("	0 - Encerrar");
		System.out.println("*************************");
		System.out.println("\nDigite uma opção: ");
		int op = scan.nextInt();
		
		switch(op) {
			case 0:
				System.out.println("\nMenu finalizado!");
				break;
			case 1:
				System.out.println("\nPróximo assento livre: " + proximoLivre());
				System.out.println("Digite o assento: ");
				n = scan.nextInt();
				addPassageiro(n);
				break;
			case 2:
				System.out.println("Quantidade de vagas disponíveis: " + this.vagas());
				break;
			case 3:
				System.out.println("Próximo assento livre: " + proximoLivre());
				break;
			case 4:
				System.out.println("Número do voo: " + getVoo());
				break;
			case 5:
				d.getData();
				break;
			case 6:
				System.out.println("Fumantes: " + getFumantes());
				break;
			case 7:
				System.out.println("Digite o assento: ");
				n = scan.nextInt();
				if(n>=tipo.size())
					System.out.println("Assento inexistente");
				else {
					if(tipo(n))
						System.out.println("Fumante");
					else
						System.out.println("Não fumante");
				}
				break;
			default:
				menuVoo(); //opção digitada inválida	
		}
		return op;
	}

}
