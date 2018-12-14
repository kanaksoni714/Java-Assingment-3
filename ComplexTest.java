import static org.junit.Assert.*;

import org.junit.Test;


public class ComplexTest {

	@Test
	public void test(){}
	public static Complex add(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        assertEquals(0,0);
		return temp;
    }
}
