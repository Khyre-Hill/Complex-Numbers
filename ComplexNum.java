/**
 * author - Khyre Hill
	
 */

package assg1_hillkh19;

public class ComplexNum {
	
	public double Real;
	public double Imagine;
	public double newReal;
	public double newImagine;
	public double ComplexNum;
	
	/**
	 * Default Constructor
	 */
	public ComplexNum() {
			Real = 0;
			Imagine = 0;
	}
	
	/**
	 * Constructor with parameter with double type (r)
	 * @param r
	 */
	public ComplexNum(double r) {
		Real = r;
		Imagine = 0;
	}
	/**
	 * Constructor with parameter uses double type (r & i)
	 * @param r
	 * @param i
	 */
	public ComplexNum(double r,double i) {
		Real = r;
		Imagine = i;
	}
	
	
	/*
	 * Retrieves Real and returns it
	 */
	
	public double getReal() {
		return Real;
	}
	/*
	 * Retrieves Imaginary number and retrieves it
	 */
	public double getImagine() {
		return Imagine;
	}
	/*
	 * sets new value of real number
	 */
	public void setReal(double r) {
		Real = newReal;
		
	}
	/*
	 * sets new imaginary number value
	 */
	public void setImagine(double i) {
		Imagine = newImagine;
	}
	
	/*
	 * adds complex number and returns new value d
	 */
	public ComplexNum Add (ComplexNum a) {
		
		double b;
		double c;
		
		
		b = this.Real + a.Real;
		c = this.Imagine + a.Imagine;
		
		ComplexNum d = new ComplexNum (b,c);
		
		return d;
	}
	
	/*
	 * subtracts complex number and returns new value e
	 */
	public ComplexNum Sub (ComplexNum a) {
		
		double b;
		double c;
		
		b = this.Real - a.Real;
		c =this.Imagine - a.Imagine;
		
		ComplexNum e = new ComplexNum (b,c);
		
		return e;
	}
	
	/*
	 * multiplies complex number and returns new value f
	 */
	public ComplexNum Mul (ComplexNum a) {
		
		double b;
		double c;
		
		b = this.Real * a.Real;
		c = this.Imagine * a.Imagine;
		
		ComplexNum f = new ComplexNum (b,c);
		
		return f;
	}
	
	/*
	 * negates complex number and returns the new value g
	 */
	public ComplexNum Neg (ComplexNum a) {
		
		double b;
		double c;
		
		b = -this.Real; 
		c = -this.Imagine;
		
		ComplexNum g = new ComplexNum (b,c);
		
		return g;
	}
	/*
	 * takes the parameters and converts them to string format
	 */
	public String toString() {
		return "ComplexNum " + Real + Imagine + "i";
	}
	
	/*
	 * public boolean equals (ComplexNum)
	 * if (ComplexNum = Null)
	 * return false;
	 */
	
	
	
	
	
}