import org.junit.Before;
import org.junit.Test;

public class DistanceTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Distance d1=new Distance(1,1.2f);
		d1.display();
		Distance d2=new Distance(2,2.2f);
		d2.display();
		Distance d3=new Distance();
		System.out.println("Addition of Distance is : "+d3.add(d1, d2).feet+" feet " + d3.add(d1, d2).inches+" inches" );
		
		
	}

}