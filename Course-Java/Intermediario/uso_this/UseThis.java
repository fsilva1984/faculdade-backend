package uso_this;

public class UseThis {
	
	Integer dia;
	Integer mes;
	Integer ano;
	
	void Data(Integer dia , Integer mes, Integer ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String formatData(Integer dia , Integer mes, Integer ano) {
		String formating = String.format("%d/%d/%d",dia, mes, ano);
		return formating;
	}
	
	/* O this aqui referencia o contrutor do metodo
	 * formatData, ele recebe os parametros passa para o
	 * metodo, a pos  o metodo formatar os parametros
	 * ele os retorna */
	String printDataFormat(int dia, int mes, int ano) {
		return this.formatData(dia , mes, ano);
	}
	
	
}
