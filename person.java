import java.util.*;
class Person{

	String name=new String();
	String gender=new String();
	String address=new String();
	int age;
	Scanner sc=new Scanner(System.in);
	Person(){
		System.out.println("--------------------");
		System.out.println("enter the name:");
		name=sc.nextLine();
		System.out.println("enter the gender:");
		gender=sc.nextLine();
		System.out.println("enter the address:");
		address=sc.nextLine();
		System.out.println("enter the age:");
		age=sc.nextInt();
		}
}

class Employee extends Person{
			int empid;
			String compname=new String();
			String qualification=new String();
			int salary;
			Scanner sc=new Scanner(System.in);

			String take_input()
			{
				String value = sc.nextLine();
				
				while(value.isEmpty())
					{
						value = sc.nextLine();
					}
				return value;
			}
			Employee(){
				System.out.println("enter the employee id:");
				empid=sc.nextInt();
				System.out.println("enter the qualification:");
				
				qualification=take_input();
				System.out.println("enter the company name:");
				compname=sc.nextLine();
				
				System.out.println("enter the salary:");
				salary=sc.nextInt();
				}
	}
class Teacher extends Employee{
			String subject=new String();
			String dept=new String();
			int techid;
			Scanner sc=new Scanner(System.in);
			Teacher(){
				System.out.println("enter the subject:");
				subject=sc.nextLine();
				System.out.println("enter the department:");
				dept=sc.nextLine();
				System.out.println("enter the techer_id:");
				techid=sc.nextInt();
				}
			public void print()
				{
					System.out.println("Teacher NAME is          : "+name);
					System.out.println("Teacher GENDER is        : "+gender);
					System.out.println("Teacher ADDRESS is       : "+address);
					System.out.println("Teacher AGE is           : "+age);
					System.out.println("Teacher EMPLOYE ID is    : "+empid);
					System.out.println("Teacher COMPANY is       : "+qualification);
					System.out.println("Teacher QUALIFICATION is : "+compname);
					System.out.println("Teacher SALARY is        : "+salary);
					System.out.println("Teacher SUBJECT is       : "+subject);
					System.out.println("Teacher DEPARTMENT is    : "+dept);
					System.out.println("Teacher ID is            : "+techid);
					System.out.println("--------------------------------------");
				}
}
class Main{
	public static void main(String args[]){
		System.out.println("Enter the number of teachers:");
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		Teacher t[]=new Teacher[n];
		for(int i=0;i<n;i++)
		{
			t[i]=new Teacher();
		}
		System.out.println("LIST :");
		System.out.println("--------------------------------------");
		for(int i=0;i<n;i++)
		{
			t[i].print();
		}
	}
}
	