import static org.junit.Assert.*;

import org.junit.Test;


public class AnnualGrossSalary {
	private EmployeeAssingment checkAnnualGross = new EmployeeAssingment();

	@Test
	public void test() {
		checkAnnualGross.setMonthlyBasic(20000);                        
		assertEquals(240000.2,checkAnnualGross.getAnnualBasic(),0.5);   
	}

}
