package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		// .add() lançará uma exceção caso a fila esteja cheia.
		// .offer() retorna falso caso a fila esteja cheia.
		// Diferença é o comportamento quando a fila está cheia!
		
		fila.add("Ana"); // Lança uma excessão
		fila.offer("Bia"); // Retorna Falso
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// Obtendo o próximo elemento da fila (Sem remover)
		// .peek() retorna null caso a fila esteja vazia..
		// .element() lançará uma exceção caso a fila esteja vazia.
		// Diferença é o comportamento ocorre quando
		// a fila está vazia!
		
		System.out.println(fila.peek()); // Retorna Null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma excessão
		System.out.println(fila.element());
		
		// Obtendo o próximo elemento da fila (E removendo ele)
		// .poll() retorna null caso a fila esteja vazia..
		// .remove() lançará uma exceção caso a fila esteja vazia.
		// Diferença é o comportamento ocorre quando
		// a fila está vazia!
		
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // Lança uma excessão
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		// fila.size()
		// fila.clear()
		// fila.isEmpty()
		// fila.contains(...)
	}
}
