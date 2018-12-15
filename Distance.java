public class Distance{

	int feet;
	float inches;

	public Distance(int feet, float inches) {
		// TODO Auto-generated constructor stub
		this.feet=feet;
		this.inches=inches;
		
	}
	
	public Distance() {
		// TODO Auto-generated constructor stub
	}

	public void set(int feet,float inches){
		this.feet=feet;
		this.inches=inches;
	}
	public void display(){
		System.out.println("Distance is : "+feet+" feet " +inches+" inches");
	}
	public Distance add(Distance d1,Distance d2) {
		Distance d=new Distance();
		d.feet=d1.feet+d2.feet;
		d.inches=d1.inches+d2.inches;
		return d;
	}

}