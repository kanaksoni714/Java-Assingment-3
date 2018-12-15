import static org.junit.Assert.*;

import org.junit.Test;


public class AnnualTakeHomeTest {
	private EmployeeAssingment AnnualTake = new EmployeeAssingment();
	@Test
	public void test() {
		AnnualTake.getMonthlyTakeHome();                      
		assertEquals(24600.2,AnnualTake.getAnnualTakeHome(),0.5); 
	}

}
