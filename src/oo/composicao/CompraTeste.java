package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra compra = new Compra();
		
		compra.cliente = "Rafael";
		compra.itens.add(new Item("Caneta", 20, 7.45));
		compra.itens.add(new Item("Borracha", 12, 3.89));
		compra.itens.add(new Item("Caderno", 3, 18.79));
		
		System.out.println(compra.itens.size());
		System.out.println(compra.getValorTotal());
	}
}
