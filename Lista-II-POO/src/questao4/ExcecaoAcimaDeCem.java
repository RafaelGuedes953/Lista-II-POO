package questao4;

public class ExcecaoAcimaDeCem extends Exception {
	
	private int n, cont, media;
	
	private static final long serialVersionUID = 1149241039409861914L;
	
	public ExcecaoAcimaDeCem(int n, int cont) {
		super();
		this.n = n;
		this.cont = cont;
		System.out.println("Soma = " + this.n);
		System.out.println("Quantidade de números = " + this.cont);
		
		if(cont>0)
			media=n/cont;
			
		System.out.println("Média = " + media);
	}

	@Override
	public String toString() {
		return "O valor passou de cem!";
	}
	
}
