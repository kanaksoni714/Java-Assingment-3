public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	public Rectangle() {
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int areaOfRectangle(){
		return length*width;
	}
	
	public int perimeterOfRectangle(){
		return 2*(length+width);
	}

}