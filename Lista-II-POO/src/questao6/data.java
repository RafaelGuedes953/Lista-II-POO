package questao6;

public class data {
	private int dia, mes, ano;
	
	public data(int dia, int mes, int ano) { //método construtor
		if(mes==2 && (dia<0 || dia>29)) //mes fevereiro não tem mais de 29 dias
			setAnoPadrao();
		else {
			if((mes==4 || mes==6 || mes==9 || mes==11)
				&& (dia<0 || dia>30)) { //meses que não tem mais de 30 dias
				setAnoPadrao();
			}
			else {
				if((dia<0 || dia>31)) // por exclusão, meses que não tem mais de 31 dias
					setAnoPadrao();
				else {
					if (ano<0 || ano>2100) //faixa válida de anos
						setAnoPadrao();
					else {
						this.mes = mes;
						this.dia = dia;
						this.ano = ano;
					}
				}
			}
		}
	}
	
	private void setAnoPadrao() {
		this.dia=1;
		this.mes=1;
		this.ano=0001;
	}
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public String getMesExtenso() {
		switch(getMes()) {
			case 1:
				return "Janeiro";
			case 2:
				return "Fevereiro";
			case 3:
				return "Março";
			case 4:
				return "Abril";
			case 5:
				return "Maio";
			case 6:
				return "Junho";
			case 7:
				return "Julho";
			case 8:
				return "Agosto";
			case 9:
				return "Setembro";
			case 10:
				return "Outubro";
			case 11:
				return "Novembro";
			case 12:
				return "Dezembro";
			default:
				return "*****Inválido*****";				
				
		}
	}
	
	public int getAno() {
		return ano;
	}
	
	public int compara(data d) {
		if (d.dia==this.dia && d.mes==this.mes && d.ano==this.ano) //datas iguais
			return 0;
		if(	   (this.ano>d.ano) //data corrente maior que parâmetro
			|| (this.ano==d.ano && this.mes>d.mes) 
			|| (this.ano==d.ano && this.mes==d.mes && this.dia>d.dia))
			return 1;
		return -1; //parâmetro maior que data corrente
	}
	
	public boolean isBissexto() {
		// ano bissexto se for divisível por 400 ou divisível por 4 e não por 100 

		if((getAno() % 400 == 0) || ((getAno() % 4 == 0) && (getAno() % 100 != 0)))
            return true;
        else
            return false;
	}

	public data clone() {
		data nD = new data(getDia(),getMes(),getAno());
		return nD;
	}
}
