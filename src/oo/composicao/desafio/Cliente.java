package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String nome;
	final List<Compra> compras = new ArrayList<>();
	
	public Cliente(String nome) {
		this.nome = nome;
	}

	public void adicionarCompras(Compra compra) {
		this.compras.add(compra);
	}
	
	public void obterValorTotal() {
		if(compras != null) {
			double valorTotal = 0;
			System.out.println("O valor das compras na area ");
			for(Compra x: compras) {
				valorTotal += x.obterValorTotal();
			}
			System.out.println(valorTotal);
		}else {
			System.out.println("Não há compras");
		}
		
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
}
