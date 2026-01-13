package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	List<Item> itens = new ArrayList<>();
	
	public Compra(Item item) {
		this.itens.add(item);
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
