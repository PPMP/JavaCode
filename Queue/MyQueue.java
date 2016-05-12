package q1;

import java.util.Collection;
import java.util.NoSuchElementException;

public interface MyQueue<E> {

	E head() throws NoSuchElementException;

	E dequeue();

	void Enqueue(E e);

	int size();

	boolean isEmpty();

	void addAll(Collection<? extends E> c);
}