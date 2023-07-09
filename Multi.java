import java.util.*;
class Employee
{
  int empid;
  String name;
  double salary;
  String address;
  Employee()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter the employee id:");
    empid=sc.nextInt();
    
    System.out.println("\nEnter the employee name:");
    name=sc.next();
    
    System.out.println("\nEnter the employee salary:");
    salary=sc.nextDouble();
    
    System.out.println("\nEnter the employee address:");
    address=sc.next();
    }
   }
 
 class Teacher extends Employee
 {
    String department; 
    String subject;
    Teacher()
    {
      Scanner sc1=new Scanner(System.in);
      System.out.println("\nEnter the department:");
      department=sc1.next();
      
      System.out.println("\nEnter the subject:");
      subject=sc1.next();
     }
void display()
 {
   System.out.println("...............................");
   System.out.println("id         :" +empid);
   System.out.println("Name       :" +name);
   System.out.println("Salary     :" +salary);
   System.out.println("Address    :" +address);
   System.out.println("Department :"+department);
   System.out.println("subject    :"+subject);
   System.out.println("...............................");
  }
}

class Multi
{
public static void main(String[] args)
{
  int n;
  Scanner sc2 = new Scanner(System.in);
  System.out.println("\nEnter the number of  employees :");
  
  n=sc2.nextInt();
  
  Teacher t[] = new Teacher[10];
  
  for(int i=1;i<=n;i++)
  { 
     t[i]= new Teacher();
  }
   System.out.println("DETAILS ARE");
   
     for(int i=1;i<=n;i++)
     {
    	 t[i].display();
     }
}
}