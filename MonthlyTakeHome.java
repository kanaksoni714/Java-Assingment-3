import static org.junit.Assert.*;

import org.junit.Test;


public class MonthlyTakeHome {
	private EmployeeAssingment Take = new EmployeeAssingment();

	@Test
	public void test() {
		Take.getMonthlyGrossSalary();
		Take.getMonthlyDeductions();                        
		assertEquals(2050,Take.getMonthlyTakeHome(),0);   
	}

}
