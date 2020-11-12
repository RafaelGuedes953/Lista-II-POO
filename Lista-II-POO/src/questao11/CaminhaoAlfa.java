package questao11;

public class CaminhaoAlfa extends Caminhao{
	//capacidade em kg, e qtd de equipamentos carregados
	private int capacidade=5000;
	
	public CaminhaoAlfa(int qtdEquip) {
		super(qtdEquip);
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	@Override
	public String inserePluviometro(Pluviometro p) {
		int peso = getPesoAtual();
		if((p.getPeso()+peso)<getCapacidade()) {
			pluvio.add(p);
			setPesoAtual(p.getPeso());
		}
		else
			return "Limite de peso atingido";
		return "Inserido com sucesso!";
	}
	
	@Override
	public void mostraDados() {
		System.out.println("*************************");
		System.out.println("	Dados:\nCapacidade: "+getCapacidade());
		System.out.println("Qtd de equipamentos: "+getQtdEquip());
		System.out.println("Carga atual: "+getPesoAtual());
		System.out.println("Qtd pluvios: "+pluvio.size());
		System.out.println("*************************");
	}

}
