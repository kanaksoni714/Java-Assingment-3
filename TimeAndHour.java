public class TimeAndHour {

	private int hours;
	private int minutes;
	
	public void setTime(int hours,int minutes){
		this.setHours(hours);
		this.setMinutes(minutes);
		
	}
	
	public TimeAndHour sum(TimeAndHour t1,TimeAndHour t2){
		
		TimeAndHour t=new TimeAndHour();
		t.setHours(t1.getHours()+t2.getHours());
		t.setMinutes(t1.getMinutes()+t2.getMinutes());
		return t;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

}