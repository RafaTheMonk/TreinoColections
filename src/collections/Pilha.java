package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno príncipe"); // Retorna valor booleano
		livros.push("Harry Potter"); // Retorna uma excessão
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String x: livros) {
			System.out.println(x);
		}
		
		// System.out.println(livros.pop()); // Lança excessão
		System.out.println(livros.poll()); // Retorna nulo
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		// System.out.println(livros.remove()); // Lança excessão
		
		// livros.size();
		// livros.clear();
		// livros.contains(...);
		// livros.isEmpty();
		
		
	}
}
