package classes;



public class DateConstructor {
	
	// atributos com valores default
	Integer day = 01;
	Integer moth = 01;
	Integer yes = 1970;
	
	// metodo mostra uma data padrao
	String fullDate(){
		String date = String.format("%d/%d/%d",
				day, moth, yes);
		return date;
	}
	
	DateConstructor(){//construtor
	
		this.fullDate();
	}
	
	
}
