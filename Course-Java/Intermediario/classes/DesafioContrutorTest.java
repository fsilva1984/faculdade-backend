package classes;

public class DesafioContrutorTest {

	public static void main(String[] args) {
		
		DesafioContrutor thisContructor = new DesafioContrutor("Notebook", 5.895, 10.0);
		
		System.out.printf("Produto: %s%n", thisContructor.nome);
		System.out.printf("Preco: %.5f %n", thisContructor.preco);
		System.out.printf("Desconto: %.1f %n", thisContructor.desc);
		System.out.printf("Val Desc: %.5f %n", thisContructor.descont());
		System.out.printf("Total: %.5f %n",thisContructor.total());
	}
}
