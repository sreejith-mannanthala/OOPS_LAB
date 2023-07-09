


package graphic;
import java.util.Scanner;
 interface shape{
void circle();
void rectangle();
void square();
void triangle();
}
public class Figures implements shape
{

 	public void circle()
 	{
 	int r ;
	double pi = 3.14, ar ;
	Scanner cl=new Scanner(System.in);	 
	System.out.println("enter radius:");
	r=cl.nextInt();	
	ar = pi * r * r;
	System.out.println("Area of circle:"+ar);	
 	}
 	
 	public void rectangle()
 	{
 	int x, y ;
   	double ar;
	Scanner rl= new Scanner(System.in);
	System.out.println("enter length and breadth :");
	x=rl.nextInt();
	y=rl.nextInt();
	ar = x* y;
	System.out.println("Area of rectangle:"+ar);
	}
	
	public void square()
	{
	int s;
	double ar;
	Scanner sq=new Scanner(System.in);
	System.out.println("enter one side:");
	s=sq.nextInt();
	ar=s*s;
	System.out.println("Area of square:"+ar);
	}
	
	public void triangle()
	{
	int h , b ;
	double ar;
	Scanner tl=new Scanner(System.in);
	System.out.println("enter breadth and height :");
	h=tl.nextInt();
	b=tl.nextInt();
	ar = h * b*1/2;
	System.out.println("Area of triangle:"+ar);
	}	
}








