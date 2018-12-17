import org.junit.Test;


public class ComplexTest {

	private ComplexNumber complexnumber1;
	private ComplexNumber complexnumber2;
	private ComplexNumber complexnumber3;
	
	@Test
	public void ComplexTest(){
		complexnumber1=new ComplexNumber();
		complexnumber1.set(100,22);
		complexnumber1.display();
		complexnumber2=new ComplexNumber();
		complexnumber2.set(11,20);
		complexnumber2.display();
		complexnumber3=new ComplexNumber();
		complexnumber3=complexnumber3.sumOfComplexNumber(complexnumber1,complexnumber2);
		complexnumber3.display();
	}
	
}
