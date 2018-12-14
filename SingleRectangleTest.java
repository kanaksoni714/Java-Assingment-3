import static org.junit.Assert.*;

import org.junit.Test;


public class SingleRectangleTest {

	@Test
	public void TestForPositiveLengthAndPositiveWidth() {
		Rectangle rectangle= new Rectangle(20,10);
		int area=rectangle.areaOfRectangle();
		int perimeter=rectangle.perimeterOfRectangle();
		assertEquals(200,area);
		assertEquals(60,perimeter);
	}
	@Test
	public void TestForPositiveLengthAndNegativeWidth() {
		Rectangle rectangle= new Rectangle(20,-10);
		int area=rectangle.areaOfRectangle();
		int perimeter=rectangle.perimeterOfRectangle();
		assertEquals(-200,area);
		assertEquals(20,perimeter);
	}
	
	@Test
	public void TestForPositiveWidthAndNegativeLength() {
		Rectangle rectangle= new Rectangle(-20,10);
		int area=rectangle.areaOfRectangle();
		int perimeter=rectangle.perimeterOfRectangle();
		assertEquals(-200,area);
		assertEquals(-20,perimeter);

	}
	
	@Test
	public void TestForNegativeLengthAndNegativeBreadth() {
		Rectangle rectangle= new Rectangle(-20,-10);
		int area=rectangle.areaOfRectangle();
		int perimeter=rectangle.perimeterOfRectangle();
		assertEquals(200,area);
		assertEquals(-60,perimeter);
		
}
}