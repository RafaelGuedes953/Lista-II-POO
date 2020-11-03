package questao2;

public class Professor {
	private String nome;
	private static int id=0; //contador de instâncias
	
	public Professor(String nome) {
		this.nome=nome;
		id++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Professor.id = id;
	}

}
