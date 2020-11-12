package questao11;

public class CaminhaoBeta extends Caminhao{

	public CaminhaoBeta(int qtdEquip) {
		super(qtdEquip);
		
	}
	
	@Override
	public String inserePluviometro(Pluviometro p) {	
		for (int i=0;i<pluvio.size();i++) {
			if (pluvio.get(i).getTipo().equals(p.getTipo())) {
				//se os tipos forem iguais
				return "Tipo já inserido!";
			}
		}
		pluvio.add(p);
		setPesoAtual(p.getPeso());
		return "Inserido com sucesso!";
	}
	
	@Override
	public void mostraDados() {
		System.out.println("*************************");
		System.out.println("	Dados:\nQuantidade de equipamentos: "+getQtdEquip());
		System.out.println("Carga atual: "+getPesoAtual());
		System.out.println("Qtd pluvios: "+pluvio.size());
		System.out.println("*************************");
	}

}
