import static org.junit.Assert.*;

import org.junit.Test;


public class MonthlyGrossSalaryTest {
	private EmployeeAssingment MonthlyGross = new EmployeeAssingment();  

	@Test
	public void test() {
		MonthlyGross.setHra(10000);
		assertEquals(2050,MonthlyGross.getMonthlyGrossSalary(),0.5);
	}
	

}
