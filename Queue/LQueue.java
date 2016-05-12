package q1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LQueue<E> implements MyQueue<E> {
	
	private LinkedList<E> myList;
	
	
	public LQueue(){
		this.myList = new LinkedList<E>();
	}

	/**
	 * return the object at the head
	 * @return the first object in the queue
	 * @precondition size() > 0
	 */
	
	public E head() throws NoSuchElementException {
		return this.myList.getFirst();
	}

	/**
	 * Removes and returns object at the head
	 * @return object that was removed
	 * @precondition size() > 0
	 */
	
	public E dequeue() {
		E item = this.myList.removeFirst();
		return item;
	}

	/**
	 * Add object to end of the queue
	 */
	
	public void Enqueue(E e) {
		this.myList.add(e);
	}

	/**
	 * Returns size of queue.
	 * @return size of queue.
	 */
	
	public int size() {
		return this.myList.size();
	}

	/**
	 * Check if queue is empty.
	 * @return true if queue empty.
	 */
	
	public boolean isEmpty() {
		return this.myList.isEmpty();
	}

	/**
	 * Adds all object in Collection to queue
	 */
	
	public void addAll(Collection<? extends E> c) {
		Iterator<? extends E> iter = c.iterator();
		
		while (iter.hasNext()) {
			E myItem = (E) iter.next();
			this.Enqueue(myItem);
		}
	}
}