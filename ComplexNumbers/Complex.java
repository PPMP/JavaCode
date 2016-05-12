package math;

//the class invariant is that the complex object is not null and has integers of type 
//double for its real and imaginary field
public final class Complex {

	private final double real;
	private final double imaginary;

	/**
	 * @precondition is there be a new Complex object that is not null 
	 * @postcondition is that there is a Complex object that is initialized with
	 * real and imaginary fields.
	 * @param real is the real number
	 * @param imaginary is the imaginary number
	 */
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	/**
	 * @precondition is there be a new Complex object that is not null 
	 * @postcondition is that there is a Complex object that is initialized with
	 * a real number and imaginary field is 0
	 * @param real is the real number
	 */
	public Complex(double real) {
		this.real = real;
		this.imaginary = 0;
	}

	/**
	 * @precondition is there should be a complex object with fields real and
	 * imaginary.
	 * @postcondition is that the function must return a formatted complex
	 * number string. 
	 * @return the formatted complex number
	 */
	public String toString() {
		if (this.imaginary > 0) {
			return this.real + " + " + this.imaginary + "i";
		} else {
			return this.real + " - " + this.imaginary * (-1) + "i";
		}
	}

	/**
	 * @precondition is there should be a complex object with fields real *and
	 * imaginary.
	 * @postcondition is that the function must compute addition of the complex
	 * numbers *@return a new object complex number
	 */

	public Complex add(Complex number) {

		return new Complex(this.real + number.real, this.imaginary
				+ number.imaginary);
	}

	/**
	 * @precondition is there should be a complex object with fields real and
	 * imaginary.
	 * @postcondition is that the function must compute subtraction of the
	 * complex numbers 
	 * @return a new object complex number
	 */
	public Complex sub(Complex number) {
		return new Complex(this.real - (number.real), this.imaginary
				- (number.imaginary));
	}

	/**
	 * @precondition is there should be a complex object with fields real and
	 * imaginary.
	 * @postcondition is that the function must compute multiplication of the
	 * complex numbers *@return a new object complex number
	 */
	public Complex mult(Complex number) {
		return new Complex((this.real * number.real)
				- (this.imaginary * number.imaginary),
				(this.real * number.imaginary) + (this.imaginary * number.real));
	}

	/**
	 * @precondition is there should be a complex object with fields real *and
	 * imaginary.
	 * @postcondition is that the function must compute the conjugate of the
	 * complex number 
	 * @return a new object conjugated complex number
	 */
	public Complex conjugate(Complex number) {
		return new Complex(number.real, (number.imaginary) * (-1));
	}

	/**
	 * @precondition is there should be a complex object with fields real and
	 * imaginary. The denominator must not be 0
	 * @postcondition is that the function must compute division of the complex
	 * numbers 
	 * @return a new object complex number
	 */
	public Complex div(Complex number) {
		Complex conjugatedNumber = conjugate(number);
		Complex numbers = this.mult(conjugatedNumber);
		Complex numberstwo = number.mult(conjugatedNumber);
		return new Complex(numbers.real / numberstwo.real, numbers.imaginary
				/ numberstwo.real);
	}

	/**
	 * @precondition is there should be a complex object with field real
	 * @postcondition is that the function must return the real field of the
	 * complex number 
	 * @return the real field of the complex number
	 */

	public double r() {
		return real;
	}

	/**
	 * @precondition is there should be a complex object with field imaginary
	 * @postcondition is that the function must return the imaginary field of
	 * the complex number 
	 * @return the imaginary field of the complex number
	 */
	public double i() {
		return imaginary;
	}

	/**
	 * @precondition is there should be two complex objects with field real and
	 * imaginary.
	 * @postcondition is that the function must return a true or false value
	 * after comparing the two complex numbers 
	 * @return a true if the complex numbers are equal
	 * @return a false if the complex numbers are not equal
	 */
	public boolean equals(Complex number) {
		return this.real == number.real && this.imaginary == number.imaginary;
	}

	public static void main(String args[]) {
		Complex x = new Complex(2, 3);
		Complex y = new Complex(4, 5);
		System.out.println((x.mult(y)).toString());
		System.out.println((x.add(y)).toString());
		System.out.println((x.div(y)).toString());
		System.out.println((x.sub(y)).toString());
		System.out.println(x.equals(y));
	}
}



