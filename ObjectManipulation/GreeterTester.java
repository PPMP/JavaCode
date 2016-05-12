package oop.greeter.q2;

//Class to test swapName and createQualifiedGreeter
public class GreeterTester {
	public static void main(String[] args) {

		// newly created greeter objects
		Greeter worldGreeter = new Greeter("World");
		Greeter worldGreetertwo = new Greeter("Sup bro");

		// testing the function swapName
		worldGreeter.swapNames(worldGreetertwo);
		System.out.println(worldGreeter.getName());
		System.out.println(worldGreetertwo.getName());

		// testing out the function createQualifiedGreeter
		Greeter g = new Greeter("world");
		Greeter g2 = g.createQualifiedGreeter("beautiful");

		// printing out the new string
		System.out.println(g2.getName());
	}
}
