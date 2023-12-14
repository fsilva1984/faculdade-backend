package uso_this;

public class UseThisTest {

	public static void main(String[] args) {
		UseThis data = new UseThis();
		
		data.dia = 1;
		data.mes = 1;
		data.ano = 1970;
		
		System.out.println(data.ano+"/"+data.mes+"/"+data.dia);
		data.formatData(18, 05, 1984);
		//String anoNasc = 
		
		//System.out.println(anoNasc);
		
		System.out.println(data.printDataFormat(2023, 11, 13));
		
	}
}
