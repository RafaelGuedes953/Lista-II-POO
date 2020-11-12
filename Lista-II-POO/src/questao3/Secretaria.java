package questao3;

import java.util.Scanner;
import java.util.ArrayList;

public class Secretaria extends Funcionario {
	Scanner scan = new Scanner(System.in);
	Datas d;
	ArrayList<Cliente> c = new ArrayList<>();
	ArrayList<Animal> a = new ArrayList<>();
	ArrayList<Secretaria> s = new ArrayList<>();
	private String dataCon = d.getDate();
    private String horaCon = d.getHour();

	public Secretaria(String nome, String cpf, int id) {
		super(nome, cpf, id);
		//d = new Datas();
	}
	
	public void marcarConsulta(Cliente cli, Animal ani, Secretaria sec){
        new Secretaria(sec.getNome(), sec.getCpf(), sec.getId());
        new Cliente(cli.getNome(), cli.getCpf(), cli.getEnd(), cli.getTel(), cli.getId());
        new Animal(ani.getNome(), ani.getDescricao(), ani.getRaca(), ani.getPeso(), ani.getAltura(), ani.getDono());

        s.add(sec);
        a.add(ani);
        c.add(cli);
    }
	
	public void editarConsulta(Cliente cli, Animal ani, Secretaria sec){
        marcarConsulta(cli, ani, sec);
    }
	
	public void mostrarConsulta(Cliente cliente, Animal animal, Secretaria secretaria){
        System.out.println("Consulta Marcarda - Data: " + dataCon + " Horario: " + horaCon);
        System.out.print("Secretaria (atendente): ");
        for(int i=0;i<s.size();i++){
            System.out.print(" " + s.get(i).getNome());
            System.out.print(", " + s.get(i).getCpf());
            System.out.print(", " + s.get(i).getId());
        }

        System.out.print("\nCliente: ");
        for(int i=0; i<c.size();i++){
            System.out.print(" " + c.get(i).getNome());
            System.out.print(", " + c.get(i).getCpf());
            System.out.print(", " + c.get(i).getEnd());
            System.out.print(", " + c.get(i).getTel());
        }
        System.out.print("\nPaciente (animal): ");
        for(int i=0;i<a.size();i++){
            System.out.print(" " + a.get(i).getNome());
            System.out.print(", " + a.get(i).getDescricao());
            System.out.print(", " + a.get(i).getRaca());
            System.out.print(", " + a.get(i).getPeso());
            System.out.print(", " + a.get(i).getAltura());
        }
    }
	
}
