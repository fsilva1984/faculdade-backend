package staticMethodAttribut;

public class StaticAttr {
	
	/*	Quando se cria uma class com alguns metodos
	 * e propriedades esses membros serao replicados
	 * em cada nova instancia ou seja cada um deles ocupara
	 * lugares em memoria,
	 * 
	 *  se for definir em uma class um metodo ou propriedade
	 *  e o seu valor nao vai mudar,
	 *  o melhor e definilo como statico pois
	 *  todas as instancias criadas usarao o mesmo metodo ou
	 *  propriedade statica da classe pai.
	 * */
	Integer a = 0;
	Integer b = 0;
	
// Modificador, tipo, variavel, e valor
	static Double PI = 3.1415;
	
	StaticAttr(Integer a, Integer b){
		this.a = a;
		this.b = b;
		 
	}
	
	
}

