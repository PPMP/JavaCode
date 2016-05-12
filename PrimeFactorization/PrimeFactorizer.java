package oop.primefactorizer.q5;

import java.util.ArrayList;

//class to computer the prime factorization and returning the results
public class PrimeFactorizer {
	private int n;
	private ArrayList<Integer> primes = new ArrayList<Integer>();
	private ArrayList<Integer> exponents = new ArrayList<Integer>();

	/**
	 * Initialize the object with target number n.
	 */
	public PrimeFactorizer(int n) {
		this.n = n;
	}

	/**
	 * Return n, the target number.
	 */
	public int getN() {
		return n;
	}

	/**
	 * Compute factorization. Do not repeat operation if it was called before.
	 */
	public void compute() {
		int j = n;
		for (int i = 2; i <= j; i++) {
			if (j % i == 0) {
				int exponentCounter = 0;
				primes.add(i);
				while (j % i == 0) {
					j /= i;
					exponentCounter++;
				}
				exponents.add(exponentCounter);
			}
		}
	}

	/**
	 * Return the factors and exponents in two arraylists. Call compute() first,
	 * if necessary. For instance, if n=60, primes=[2,3,5], and
	 * exponents=[2,1,1].
	 */
	public void getFactorsAndExponents(int n, ArrayList<Integer> primes,
			ArrayList<Integer> exponents) {
		if (n != this.n || this.primes.size() == 0
				|| this.exponents.size() == 0) {
			this.n = n;
			compute();
		}

		for (int i = 0; i < this.primes.size(); i++) {
			primes.add(this.primes.get(i));
		}

		for (int i = 0; i < this.exponents.size(); i++) {
			primes.add(this.exponents.get(i));
		}

	}

	/**
	 * Return a string with the "pretty" representation of the prime
	 * factorization. For instance, if n is 60, then toString() for the
	 * PrimeFactorizer(60) object should be "60 = 2^2*3*5". Call compute() if
	 * not done before.
	 */
	public String toString() {
		if (this.primes.size() == 0 || this.exponents.size() == 0) {
			compute();
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < primes.size(); i++) {
			if (exponents.get(i) == 1 && i != 0) {
				sb.append("*" + primes.get(i));
			} else if (exponents.get(i) == 1) {
				sb.append(primes.get(i));
			} else {
				sb.append(primes.get(i) + "^" + exponents.get(i));
			}
		}
		return getN() + " = " + sb.toString();
	}
}
