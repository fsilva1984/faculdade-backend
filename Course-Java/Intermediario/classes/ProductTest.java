package classes;

public class ProductTest {
	
	public static void main(String[] args) {
		
			
		// instancias da class Produto
		Product notebook = new Product();
		Product geladeira = new Product();
		
		// atributos do objeto ou instancia
		notebook.name = "Philco";
		notebook.price = 2.358;
		notebook.discount = 1.5;
		
		
		// atributos do objeto ou instancia
		geladeira.name = "Consul";
		geladeira.price = 2.000;
		geladeira.discount = 5.0;

		System.out.println(geladeira.name);
		System.out.printf("Preço %.3f %n", geladeira.price);
		System.out.printf("Desconto %.1f %n", geladeira.discount);
		
		Double desc = (geladeira.discount * geladeira.price) / 100;
		Double total = geladeira.price - desc;
		System.out.printf("Total %.3f", total);
		
	}
}
