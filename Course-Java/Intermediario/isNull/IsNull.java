package isNull;

public class IsNull {
// variaveis de instancias tem valor padrao
	// quando sao definidas
	
	int a;// valor default 0
	double y;// valor default 0.0
	String f;// valor default null

	
//	Aqui temos um construtor que define o valor das variaveis 
// de acordo com o que ele recebe por parametros
	void setVal(int a, double y, String f) {
		this.a = a;
		this.y = y;
		this.f = f;
	}
	


	String formatValue(int a, double y, String f) {
		return a+"-"+y+"-"+f;
	}
	
	
	String printValues(int a, double y, String f) {

		return this.formatValue(a, y, f);
	}
	
}

