package math;

import org.junit.Assert;
import org.junit.Test;

public class TestComplex {

	 //testing Complex.equals
    @Test
    public void testEquals() {
	System.out.println("run test equals");
	double a = 8, b = 8, c = 8, d = 8;
	double e = c, f = d;
	Complex x = new Complex(a,b);

	Complex z = new Complex(e,f);

	// set up Complex objects
	// test condition using the Complex equals() method:
	Assert.assertTrue(z.equals(x));
    }
    
    
	 //testing Complex.add
    @Test
    public void testAdd() {
	System.out.println("run test add");
	double a = 1, b = 2, c = -3, d = 4;
	double e = a + c, f = b + d;
	Complex x = new Complex(a,b);
	Complex y = new Complex(c,d);

	Complex w = x.add(y);

	Complex z = new Complex(e,f);

	// set up Complex objects
	// test condition using the Complex equals() method:
	Assert.assertTrue(z.equals(w));
    }
    
	 // testing Complex.sub
    @Test
    public void testSub() {
	System.out.println("run test sub");
	double a = 2, b = -3, c = 6, d = -18;
	double e = a - c, f = b - d;
	Complex x = new Complex(a,b);
	Complex y = new Complex(c,d);

	Complex w = x.sub(y);

	Complex z = new Complex(e,f);

	// set up Complex objects
	// test condition using the Complex equals() method:
	Assert.assertTrue(z.equals(w));
    }
    
	 // testing Complex.mult
    @Test
    public void testMult() {
	System.out.println("run test mult");
	double a = 3, b = 2, c = 1, d = 7;
	double e = (a * c) - (b * d), f = (a * d) + (b * c);
	Complex x = new Complex(a,b);
	Complex y = new Complex(c,d);

	Complex w = x.mult(y);

	Complex z = new Complex(e,f);

	// set up Complex objects
	// test condition using the Complex equals() method:
	Assert.assertTrue(z.equals(w));
    }
    
    // testing Complex.div
    @Test
    public void testDiv() {
	System.out.println("run test div");
	double a = 4, b = 2, c = 3, d = -1, g = 1, h = 1;
	double e = g , f = h;
	Complex x = new Complex(a,b);
	Complex y = new Complex(c,d);

	Complex w = x.div(y);

	Complex z = new Complex(e,f);

	// set up Complex objects
	// test condition using the Complex equals() method:
	Assert.assertTrue(z.equals(w));
    }
}
