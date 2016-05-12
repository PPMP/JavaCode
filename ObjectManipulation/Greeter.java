package oop.greeter.q2;

/**
 * A class for producing simple greetings. that swaps the names of this greeter
 * and another instance.
 */
public class Greeter {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Constructs a Greeter object that can greet a person or entity.
	 * @param aName the name of the person or entity who should be addressed in
	 * the greetings.
	 */
	public Greeter(String aName) {
		name = aName;
	}

	/**
	 * Greet with a "Hello" message.
	 * @return a message containing "Hello" and the name of the greeted person
	 * or entity.
	 */
	public String sayHello() {
		return "Hello, " + name + "!";
	}

	/**
	 * @param other
	 * is the object reference being passed in by value to be
	 * swapped.
	 */
	public void swapNames(Greeter other) {
		String holder = other.name;
		other.name = this.name;
		this.name = holder;
	}

	/**
	 * @param qualifier is String that needs to be added
	 * @return returns the newObject that includes the qualifier + name
	 */
	public Greeter createQualifiedGreeter(String qualifier) {
		Greeter newObject = new Greeter(qualifier + " " + this.name);
		return newObject;
	}
}
