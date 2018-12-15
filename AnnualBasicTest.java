import static org.junit.Assert.*;

import org.junit.Test;


public class AnnualBasicTest {

	private EmployeeAssingment checkAnnualbasic = new EmployeeAssingment();
	@Test
	public void test() {
		
		checkAnnualbasic.setMonthlyBasic(20000);
		assertEquals(240000.2,checkAnnualbasic.getAnnualBasic(),0.5);
	}

}
