import java.util.*;
interface areaperi
  {
      void area();
      void perimeter();
   }
   
	class rectangle implements areaperi
   {
     int l=10,b=20;
     public void area()
     	{
    	 	System.out.println("\nArea of rectangle :"+l*b);
     	}
     public void perimeter()
     	{
    	 	System.out.println("\nPerimeter of rectangle :"+(2*(l+b)));
     	}
    }
    
   class circle implements areaperi
    {
       int r=10;
       public void area()
       		{
    	   		System.out.println("\nArea  of circle :"+3.14*r*r);
       		}
        public void perimeter()
        	{
        		System.out.println("\nPerimeter of circle :"+2*3.14*r);
        	}
      }
        
 class InterfaceMenu
 {
 public static void main(String[] args)
 {
	 rectangle r= new rectangle();
	 circle c=new circle();
	 int ch=0;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("\nEnter \n1.for circle \n2.for rectangle");
	 ch=sc.nextInt();
	 switch(ch)
	 {
	 	case 1:
	 			c.area();
	 			c.perimeter();
	 			break;
	 	case 2:
	 			r.area();
	 			r.perimeter();
	 			break;
	 }
 }
 }
 