package oop.primefactorizer.q5;

import java.util.Scanner;

//Class to get user input and prime factorize the user input
public class PrimeFactorTest {

	public static void main(String[] args) {
		// gets user input
		Scanner myInput = new Scanner(System.in);
		int n = myInput.nextInt();

		// tests the prime factorization
		PrimeFactorizer myObject = new PrimeFactorizer(n);
		System.out.println(myObject.toString());

		// closes the input
		myInput.close();
	}
}
