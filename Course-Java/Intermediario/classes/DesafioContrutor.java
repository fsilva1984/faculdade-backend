package classes;


 public class DesafioContrutor {
	 String nome;
	 Double preco;
	 Double desc;
	 Double descont() {
			var valDesc = (desc * preco) / 100;
			return  valDesc;
		}
	Double total() {
		
		var valDesc = (desc * preco) / 100;
		return preco - valDesc;
	}

		DesafioContrutor(String nome, Double preco, Double desc){
			this.nome = nome;
			this.preco = preco;
			this.desc = desc;
			this.descont();
			this.total();
		
		}

}
