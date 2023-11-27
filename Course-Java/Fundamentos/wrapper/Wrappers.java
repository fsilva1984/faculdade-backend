package wrapper;

/*
 *  Wrappers? define metodos para tipos primitivos no java
 *  exemplo: declarando um 'float' primitivo,
 *  declarando um 'Float' orientado a objetos
 *  note que a primeira letra do primitivo muda
 *  para mauiscula, assim segue tambem,
 *  
 *  Byte: byte
 *  Short: short
 *  Integer: int
 *  Float: float
 *  Double: double
 *  
 *  Boolean: boolean
 *  Character: char
 *  
 *  usando o Float deve se acrescentar o F no fim do numero
 *  assim tambem deve acrescentar o L no fim do numero Long 
 *  
 *  
 * */

public class Wrappers {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		Byte numByte = 100;
		Short numShort = 358;
		Integer numInt = 3874;

		Float numFloat = 127.89F;
		Double numLong = 2389.2569;

		System.out.println(numByte.intValue());
		System.out.println(numShort.toString().replace("5", "7"));
		System.out.println(numInt.equals(numFloat));
		System.out.println(Integer.toString(1000).concat("!!"));

		System.out.println(numFloat.toString().concat(" R$"));
		System.out.println(numLong.doubleValue());

		Boolean yes = true;
		Boolean no = false;

		System.out.println(yes.booleanValue());
		System.out.println(yes.equals(no));
		System.out.println(yes.toString().charAt(1));

		System.out.println(no.toString().replace("f", "F"));
		System.out.println(no.toString().toUpperCase());

		Character c = '#';// Importante lembrar que o char usa aspas unica

		System.out.println(c.toString().replace("#", "?"));

	}
}
