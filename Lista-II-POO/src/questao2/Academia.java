package questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Academia {
	private String nome;
	ArrayList<Professor> p; //p->professores
	ArrayList<Aluno> a; //a->alunos
	
	Scanner scan = new Scanner(System.in);
	
	public Academia(String nome) {
		setNome(nome);
		p = new ArrayList<>();
		a = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addProfessor(String nome) {
		Professor novo = new Professor(nome);
		p.add(novo);
	}
	
	public void addAluno(String cpf, String nome) {
		Aluno novo = new Aluno(cpf, nome);
		a.add(novo);
	}
	
	public void entradaAluno(String cpf) {
		Aluno alunoAtual;
		Professor pAtual;
		
		for(int i=0;i<a.size();i++) {
			alunoAtual=a.get(i);
			if(cpf.equals(alunoAtual.getCpf())){
				System.out.println("Entrada liberada!");
				pAtual=p.get(alunoAtual.getProfId());
				System.out.println("Professor -> "+pAtual.getNome());
				alunoAtual.mostraExerc();
				break;
			}
			else
				if(i==a.size())
					System.out.println("Aluno não encontrado!\nRecomendamos realizar o cadastro!");
		}
	}
	
	public void mostrarAlunos() {
		Aluno alunoAtual;
		Professor pAtual;
		
		if(a.size()>0) {
			System.out.println("**** Alunos ****");
			for(int i=0;i<a.size();i++) {
				alunoAtual=a.get(i);
				System.out.println("["+i+"] Nome -> "+alunoAtual.getNome());
				System.out.println("	CPF -> "+alunoAtual.getCpf());
				if(alunoAtual.getProfId()!=-1) {
					pAtual=p.get(alunoAtual.getProfId());
					System.out.println("	Professor -> "+pAtual.getNome());
				}
				else
					System.out.println("	Professor -> Não atribuído");
			}
			System.out.println("****************");
		}
		else
			System.out.println("Nenhum aluno cadastrado ainda!");
	}
	
	public void mostrarProfessores() {
		Professor profAtual;
		if(p.size()>0) {
			System.out.println("**** Professores ****");
			for(int i=0;i<p.size();i++) {
				profAtual=p.get(i);
				System.out.println("["+i+"] Nome -> "+profAtual.getNome());
			}
			System.out.println("*********************");
		}
		else
			System.out.println("Nenhum professor cadastrado ainda!");
	}
	
	public void atribuirProf(String cpf, int id) {
		Aluno alunoAtual;
		
		for(int i=0;i<a.size();i++) {
			alunoAtual=a.get(i);
			if(cpf.equals(alunoAtual.getCpf())){
				alunoAtual.setProfId(id);
				System.out.println("Atribuído com sucesso!");
				break;
			}
			else
				if(i==a.size())
					System.out.println("Erro! Aluno não encontrado!");
		}
	}
	
	public void editarExercicios(int ind, int tam) {
		Aluno alunoAtual=a.get(ind);
		
		if(tam>0)
			for(int i=0;i<tam;i++) {
				System.out.print("\nDigite o exercício ["+i+"]: ");
				alunoAtual.exerc.add(scan.nextLine());
			}
		else
			System.out.println("O tamanho deve ser maior que zero! Tente novamente!");
	}
	
	public int Menu() {
		String nome, cpf;
		int id, tam, op;
		
		System.out.println("***** Menu Academia *****");
		System.out.println("	1 - Adicionar aluno");
		System.out.println("	2 - Adicionar professor");
		System.out.println("	3 - Entrada de aluno");
		System.out.println("	4 - Mostrar professores");
		System.out.println("	5 - Mostrar alunos");
		System.out.println("	6 - Atribuir professor");
		System.out.println("	7 - Adicionar exercícios");
		System.out.println("	0 - Encerrar");
		System.out.println("*************************");
		System.out.println("\nDigite uma opção: ");
		op = Integer.parseInt(scan.nextLine());
		
		switch(op) {
			case 0:
				System.out.println("Menu finalizado!");
				break;
			case 1:
				System.out.println("Digite o nome: ");
				nome=scan.nextLine();
				System.out.println("Digite o CPF: ");
				cpf=scan.nextLine();
				addAluno(cpf, nome);
				break;
			case 2:
				System.out.println("Digite o nome do professor: ");
				nome=scan.nextLine();
				addProfessor(nome);
				break;
				
			case 3:
				System.out.println("CPF do aluno: ");
				cpf=scan.nextLine();
				entradaAluno(cpf);
				break;
				
			case 4:
				mostrarProfessores();
				break;
			
			case 5:
				mostrarAlunos();
				break;
			
			case 6:				
				System.out.println("Digite o CPF: ");
				cpf=scan.nextLine();
				mostrarProfessores();
				
				if(p.size()>0) {
					System.out.println("Digite o id do Professor: ");
					id=Integer.parseInt(scan.nextLine());
					atribuirProf(cpf, id);
				}
				else
					System.out.println("Favor cadadtrar um professor antes da atribuição!");
				break;
				
			case 7:
				//editar lista de exercícios de determinado aluno
				System.out.println("Índice do aluno: ");
				id=Integer.parseInt(scan.nextLine());
				System.out.println("Quantos exercícios serão adicionados? ");
				tam=Integer.parseInt(scan.nextLine());
				editarExercicios(id, tam);
				break;
				
			default:
				System.out.println("Opção inválida!");
		}
		
		return op;
	}

}
