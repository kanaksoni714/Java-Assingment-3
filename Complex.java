
public class Complex {
public float real;
public float imaginary;


public void set(float real, float imaginary){
	this.real=real;
	this.imaginary=imaginary;

	}
public void display(){
	System.out.println("Complex Number is="+this.real+"+"+"i"+this.imaginary);
}

public Complex sumOfComplexNumber(ComplexNumber object1,ComplexNumber object2)
{	this.real=object1.real+object2.real;
	this.imaginary=object1.imaginary+object2.imaginary;
    
    return this;
}


	}
