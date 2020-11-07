package questao7;

import questao6.data;
import java.util.ArrayList;
import java.util.Scanner;

public class Voo {
	private data d;
	private int id, tam=100;
	//lista de ocupados, inicialmente vazia
	ArrayList<Integer> ocupados, livres; //livres pode ser removido? verificar
	//contador de instâncias da classe, utilizado para atribuir número do voo
	public static int contVoo=0;
	Scanner scan = new Scanner(System.in);
	
	public Voo(int dia, int mes, int ano) { //construtor
		this.id = contVoo+100;
		contVoo++;
		d = new data(dia, mes, ano);
		if (d.getAno()==1)
			System.out.println("Valor de data inválida inserida!!!");
		ocupados = new ArrayList<>();
		livres = new ArrayList<>();
		for(int i=0;i<tam;i++) //preenche vetor dos assentos livres
			livres.add(i); //número dos assentos começando de 0 até tamanho definido*/
	}
	
	public void setTamanho(int tam) {
		this.tam=tam;
	}
	
	public int getTamanho() {
		return tam;
	}
	
	public int getVoo() {
		return id;
	}
	
	public void addPassageiro(int assento) {
		//antes verificar se assento está ocupado
		if(ocupados.size()==tam || verifica(assento)) {
			ocupados.add(assento); //ocupa o assento
			//remover onde tem o número do assento
			livres.removeIf(livres -> livres.equals(assento));
			//livres.remove(assento);	//remove assento da lista de livres
		}
		else
			System.out.println("Assento está ocupado!");
		
	}
	
	private boolean verifica(int n) {
		for(int i=0;i<ocupados.size();i++)
			if(ocupados.get(i)==n)
				return false; //assento está ocupado
		return true; //assento liberado
	}
	
	public int vagas() { //retorna o número de vagas disponíveis
		return livres.size();
	}
	
	public int proximoLivre() { //retorna primeiro valor da lista de livres
		return livres.get(0);
	}
	
	public int menuVoo() {
		int n;
		
		System.out.println("***** Menu Elevador *****");
		System.out.println("	1 - Adicionar passageiro");
		System.out.println("	2 - Ver número de vagas");
		System.out.println("	3 - Próximo assento livre");
		System.out.println("	4 - Número do voo");
		System.out.println("	5 - Ver data do voo");
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
				System.out.println("Quantidade de vagas disponíveis: " + vagas());
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
			default:
				menuVoo(); //opção digitada inválida	
		}
		return op;
	}

}
