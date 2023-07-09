import java.util.*;

class Multi extends Thread
	{
		int num1,i;

			Multi(int n)
			{
					num1=n;
			}
	public void run()
	 	{
	 	
	 	 	System.out.println("Multiplication table");
	 	 	for(i=1;i<=10;i++)
	 	 	{
	 	 		System.out.println(i+"*"+num1+"="+i*num1);
	 	 	}
	 	}
	}
class Prime extends Thread
{
	int num,i,j,flag;
	Prime(int n)
		{
			num=n;
		}
	public void run()
	{
		System.out.println("---------------------");
		System.out.println("Prime numbers");
		System.out.println("-------------");
	for(i = 2; i <= num; i++)
         {
	     flag=0;
             for( j = 1; j <=i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = flag+1;
                 }
             }
             if(flag == 2)
             {
                 System.out.println(i+" is a prime");
             }
         }
      }   
  }
class Threads
	{
	 public static void main(String args[])
	 	{ 
	 	int n;
	 	Scanner s = new Scanner(System.in);
         System.out.println ("Enter the number :"); 
         n= s.nextInt();
         	
	 	 Multi m=new Multi(n);
	 	 m.start();
	 	
	 	 Prime p=new Prime(n);
	 	 p.start();
	 	}	
	}