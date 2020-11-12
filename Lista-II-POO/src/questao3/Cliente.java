package questao3;

public class Cliente {
	private int id;
	private String nome, cpf, end, tel;

    public Cliente(String nome, String cpf, String end, String tel, int id) {
        setId(id);
        setNome(nome);
        setCpf(cpf);
        setEnd(end);
        setTel(tel);
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
