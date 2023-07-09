import java.util.Scanner;
class OverloadArea 
{
  void calculateArea(float x)
  {
     System.out.println("\nArea of the square     : "+x*x+"sq.units");
  }
  void calculateArea(float x,float y)
  {
     System.out.println("\nArea of the rectangle  : "+x*y+"sq.units");
  }
  void calculateArea(double r)
  {
     double area=3.14*r*r;  
     System.out.println("\nArea of the circle     : "+area+"sq.units");
  }
  public static void main(String[] args)
  {
     int s;
     float l,b;
     double r;
     OverloadArea obj=new OverloadArea();
     Scanner sc=new Scanner(System.in);
     System.out.println("\n Enter the side of Square :");
          s=sc.nextInt();
     System.out.println("\n Enter the length and breadth of rectangle :");
          l=sc.nextFloat();
          b=sc.nextFloat();
     System.out.println("\n Enter the radius of circle :");
          r=sc.nextDouble();
          obj.calculateArea(s);
          obj.calculateArea(l,b);
          obj.calculateArea(r);
   }
}