import static org.junit.Assert.*;

import org.junit.Test;


public class DeductionTest {

	
		private EmployeeAssingment Deductions = new EmployeeAssingment();
		
		
		@Test
		public void test() {
			Deductions.getEsic(12220);
			Deductions.getProfTax(10000);
			assertEquals(50,Deductions.getMonthlyDeductions(),0.5);
		}
		
}
