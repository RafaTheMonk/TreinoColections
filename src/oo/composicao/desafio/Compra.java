package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(qtde, p));
	}
	
	void adicionarItem(String nome, double preco, int qtde) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(qtde, produto));
	}
	
	public double obterValorTotal() {
		if(itens != null) {
			double valorTotal = 0;
			for(Item x: itens) {
				valorTotal += (x.quantidade * x.produto.preco);
			}
			return valorTotal;
		} else {
			return 0;
		}
	}
}
