package oo.composicao.desafio;

public class TestaDesafio {

	public static void main(String[] args) {
			
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.56, 100);
		compra1.adicionarItem(new Produto("Notebook", 1897.88), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 998.90), 1);
		
		Cliente cliente1 = new Cliente("Rafael");
		cliente1.compras.add(compra1);
		cliente1.compras.add(compra2);
		
		cliente1.obterValorTotal();
	}

}
