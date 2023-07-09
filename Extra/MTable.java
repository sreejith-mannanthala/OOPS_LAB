import java.util.Scanner;

public class MTable {
	public static void main(String[] args) {
		
	int num,i;
	Scanner s= new Scanner(System.in);
	
	System.out.println("Enter the number : ");
	
	num=s.nextInt();
	
	for(i=1;i<=10;i++) {
		System.out.println(num+ " * " +i+ " = " + num*i);
	}
	}

}
