
public class EmployeeAssingment {
	private  int id;
	private  String name;
	private  int monthlyBasic;
	private float PFRate;
	private double hra=0.5* this.monthlyBasic;
	private static float conveyance=800;
	private static float medical=1250;
	private static double pf;
	private float esic; 
	private float profTax;
	private int MonthlyGrossSalary;

/*
	//public static void main(String[] args) {
		hra=0.5* monthlyBasic;
	//	if (pf<6500){
			pf=0.1*monthlyBasic;
//		}
	//	else pf=6500; 
		//if (monthlyBasic<=5000)
		//{
	//		esic= (float) (0.0475*monthlyBasic);
	//	}
	//	else monthlyBasic=5000;
	//	if (MonthlyGrossSalary<=10000){
		
	//	profTax=50;
		//}
		//else profTax= 100;
		
	//	}
		
		
	*/
	
	public  int getId() {
		return this.id;
	}
	public  void setId(int Id) {
		this.id = Id;
	}
	public double getAnnualBasic(){
		return 12 * this.monthlyBasic;
	}
	public  int getMonthlyBasic() {
		return this.monthlyBasic;
	}
	public  String getName() {
		return this.name;
	}	
	public  void setName(String name) {
		this.name = name;
	}
	public  void setMonthlyBasic(int monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	public float getAnnualGrossSalary(){
		return 12 * this.monthlyBasic;
	}
	public double getMonthlyGrossSalary(){
		return  this.hra + this.medical + this.conveyance;
	}
	public double getMonthlyDeductions(){
		return this.pf + this.esic + this.profTax;
	}
	public double getMonthlyTakeHome(){
		return this.getMonthlyGrossSalary()- this.getMonthlyDeductions();
	}
	public double getAnnualTakeHome(){
		return 12 * this.getMonthlyTakeHome();
	}
	public float setPFRate()  {
		this.PFRate = PFRate;
		return this.PFRate;
	}
	public float getPFRate(){
		return this.PFRate=PFRate;
	}
	public double getHra(int i) {
		return hra;
	}
	public void setHra(int i) {
		this.hra=hra;
	} 
	public void getEsic(int j) {
		
		if (this.monthlyBasic<=5000)
		{
			esic= (float) (0.0475*this.monthlyBasic);
		}
		else this.monthlyBasic=5000;
		
	}
	public void getProfTax(int k){
		if (MonthlyGrossSalary<=10000){
			profTax=50;
			}
			else profTax= 100;
	}
}








//*	public double getEsic(int j){
	//	if (this.monthlyBasic<=5000)
	//*	{
			//esic= (float) (0.0475*this.monthlyBasic);
	//*	}
	//	else this.monthlyBasic=5000;
	//	return j;
	//}
	//public double getProfTax(int k){
//	if (MonthlyGrossSalary<=10000){
		//profTax=50;
		//}
	//	else profTax= 100;
	//return k;
	// } 
	
	


