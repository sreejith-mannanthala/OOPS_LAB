import java.util.*;
class Employee 
{
	int empid;
	String name,address;
	double salary;
	
	Employee()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the employee id       :");
		empid = s.nextInt();
		System.out.println("Enter the employee name     :");
		name = s.next();
		System.out.println("Enter the employee salary   :");
		salary = s.nextDouble();
		System.out.println("Enter the employee address  :");
		address = s.next();
 	}
}
class Teacher extends Employee{
	
	String department,subject;
	Teacher()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the department :");
		department=s.next();
		System.out.println("Enter the Subject :");
		subject=s.next();
		
	}
void display() {
	System.out.println("id         :"+empid);
	System.out.println("Name       :"+name);
	System.out.println("Salary     :"+salary);
	System.out.println("Address    :"+address);
	System.out.println("Department :"+department);
	System.out.println("Subject    :"+subject);
	System.out.println("----------------------");
}
}
class SingleInheritance {
	public static void main(String[] args) {
		
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of employees:");
		n=s.nextInt();
		Teacher t[]=new Teacher[n];
		for(i=0; i<n; i++) 
		{
			t[i]=new Teacher();
		}
		System.out.println("\nDetails are");
		System.out.println("-------------------------");
		for(i=0;i<n;i++)
		{
			t[i].display();
		}
	}
}