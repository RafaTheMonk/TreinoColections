package oo.composicao.desafio;

public class TestaDesafio {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Detergente", 2.90);
		Produto produto2 = new Produto("Biscoito", 3.50);
		
		Item item1 = new Item(2, produto1);
		Item item2 = new Item(3, produto2);
		
		Compra compra1 = new Compra(item1);
		compra1.itens.add(item2);
		
		Cliente cliente1 = new Cliente("Rafael");
		cliente1.adicionarCompras(compra1);
		
		cliente1.obterValorTotal();
	}

}
