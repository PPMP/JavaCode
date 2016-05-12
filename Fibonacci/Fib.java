package oop.Fibonacci.q1;

/**
 * A class for calculating fibonacci sequence iteratively and recursively and
 * printing out the sequence
 */
public class Fib {

	private int f0;
	private int f1;

	/**
	 * Constructs f0 and f1 objects which are the first and second numbers in
	 * the fibonacci sequence
	 */
	public Fib(int f0, int f1) {
		this.f0 = f0;
		this.f1 = f1;
	}

	/**
	 * computes fibonacci sequence iteratively
	 * @param n is the number of numbers for the sequence
	 * @return returns the fibonacci number
	 * @throws IllegalArgumentException
	 * if there is an illegal argument.
	 */
	public int f(int n) throws IllegalArgumentException {
		int currentResult = 0, nextResult = 1;
		for (int i = 0; i < n; i++) {
			int addLater = currentResult;
			currentResult = nextResult;
			nextResult = addLater + nextResult;
		}
		return currentResult;

	}

	/**
	 * computes fibonacci sequence recursively
	 * @param n is the number of numbers for the sequence
	 * @return returns the fibonacci number
	 * @throws IllegalArgumentException
	 * if there is an illegal argument.
	 */
	public int fRec(int n) throws IllegalArgumentException {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return (fRec(n - 1) + fRec(n - 2));
		}
	}

	// To get args[0] and args[1] to compute fibonacci
	// Throws illegal argument exceptions
	public static void main(String[] args) {

		// get numbers F(0) and F(1) from args[0] and args[1].
		int f0 = Integer.parseInt(args[0]);
		int f1 = Integer.parseInt(args[1]);

		// get n from args[2]:
		int n = Integer.parseInt(args[2]);

		// create a Fib object with params F(0) and F(1)
		// instance variables store F(0) and F(1):
		try {
			Fib fibObject = new Fib(f0, f1);
			
			// calculate F(0), ..., F(n) and display them with
			// System.out.println(...) using
			// the iterative method f(i)
			for (int i = 0; i < n; i++) {
				System.out.println(fibObject.f(i));
			}

			// calculate F(0), ..., F(n) and display them with
			// System.out.println(...) using
			// the recursive method fRec(i)
			for (int i = 0; i < n; i++) {
				System.out.println(fibObject.fRec(i));
			}
		} catch (Exception E) {
			System.err.print(E);
			System.exit(1);
		}
	}
}
