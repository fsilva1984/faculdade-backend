package arrays;

import javax.swing.JOptionPane;
public class SelectValue {
	
public static void main(String[] args) {
	
	String search = JOptionPane.showInputDialog("Procurar Fruta ?");
	
	
	
/////////////// INFO DOS PRODUTOS NO BANCO DE DADOS ///////////////////////
	String[] fruits = {"Manga", "Uva", "Banana", "fim"};
	
	String[] fruitProps = {
			"Manga: excelente fonte de vitaminas A e C"
							+ " ela possui vitaminas do complexo B, cálcio,"
							+ "fósforo, potássio e sódio.",
					
			"Uva fonte de vitamina E, vitamina C, vitamina K e vitamina A,"
							+ "além de minerais como o cálcio, ferro e potássio.",
							
			"A banana é rica em vitaminas (C, B1, B2 e B6)"
							+ " e nos minerais cálcio, ferro, potássio e fósforo."
							};
	
	Double[] preco = {6.75, 8.25, 4.85};
///////////////////////////////////////////////////////////////////////
	
	
	
	
// faz a pesquisa em todo o array	
	for(int i = 0; i < fruits.length; i++){
		
//manter posicoes alinhadas, o for acha o produto acha tambem preco e info.
		if(search.equalsIgnoreCase(fruits[i])) {
			String msg = String.format("Preço: %.2fkg info: %s", preco[i], fruitProps[i]);
			JOptionPane.showMessageDialog(null, msg);
			break;
// na ultima posicao do array de frutas tem a string 'fim' se o for chegar ate la
// e porque nao tem a fruta no estoque.
		} else if (fruits[i].equalsIgnoreCase("fim")){
			JOptionPane.showMessageDialog(null, "Não temos essa fruta em nosso estoque :(");
		}

	}
	
	
	
	
}
}
