import java.util.Scanner;

class Complex {
	
	int real , img ;
	
	Complex(int r, int i){
		
		real = r;
		img  = i;
	}
	
	Complex Add(Complex c1 , Complex c2) {
	
		Complex result = new Complex(0 ,0);
		result.real = c1.real + c2.real;
		result.img = c1.img + c2.img;
		
		return result;
}
}
class AddComplex {
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Complex c1 = new Complex(0 , 0);
		Complex c2 = new Complex(0 , 0);
		Complex c3 = new Complex(0 , 0);
		
		System.out.println("-- Enter the First complex number --\n\nReal :");
		c1.real = s.nextInt();
		System.out.println("imaginary :");
		c1.img = s.nextInt();
		
		System.out.println("-- Enter the Second complex number --\n\nReal :");
		c2.real = s.nextInt();
		System.out.println("imaginary :");
		c2.img = s.nextInt();
		
		Complex ans = c3.Add(c1, c2);
		System.out.println("Sum of Complex number : "+ans.real+" + "+ans.img+"i");
	}
}

