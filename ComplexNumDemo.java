package assg1_hillkh19;

public class ComplexNumDemo {

	public static void main(String[] args) {
		

		/*
		 * Example complex and real nums
		 */
		
		ComplexNum n1 = new ComplexNum ();
		ComplexNum  n2 = new ComplexNum (7 , 4.5);
		ComplexNum  n3 = new ComplexNum (8 , 5.5);
		ComplexNum  n4 = new ComplexNum (9 , 6.5);
		ComplexNum n5 = new ComplexNum (10 , 7.5);
		
		/*
		 * test getReal method
		 */
		//getReal
		System.out.println("ComplexNum: " + n1.getReal());
		System.out.println("ComplexNum: " + n2.getReal());
		System.out.println("ComplexNum: " + n3.getReal());
		System.out.println("ComplexNum: " + n4.getReal());
		System.out.println("ComplexNum: " + n5.getReal());
		System.out.println();
	

		/*
		 * test getImagine method
		 */
	//getImagine 
	System.out.println("ComplexNum:" + n1.getImagine());
	System.out.println("ComplexNum:" + n2.getImagine());
	System.out.println("ComplexNum:" + n3.getImagine());
	System.out.println("ComplexNum:" + n4.getImagine());
	System.out.println("ComplexNum:" + n5.getImagine());
	System.out.println();
	
	
	/*
	 * test setReal method
	 */
	//setReal
	n4.setReal(7.1);
	System.out.println("ComplexNum n4: " + n4.getReal()); 
	System.out.println(); 
	
	/*
	 * test setImagine method
	 */
	//setImagine
	n4.setImagine(8.4);
	System.out.println("ComplexNum n4: " + n4.getImagine()); 
	System.out.println(); 
	
	/*
	 * test add function and prints 
	 */
	//Add
	n3 = n1.Add(n5);
	System.out.println(n3);
	
	/*
	 * test sub function and prints
	 */
	//Sub
	n5 = n3.Sub(n1);
	System.out.println(n5);
	
	/*
	 * test mul function and prints
	 */
	//Mul
	n1 = n2.Mul(n3);
	System.out.println(n1);
	
	/*
	 * test neg function and prints
	 */
	//Neg
	n2 = n5.Neg(n5);
	System.out.println(n2);
	
}
}