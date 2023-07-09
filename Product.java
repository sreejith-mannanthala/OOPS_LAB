class Cost{
	
	int price;
	String pname;
	int pcode;
	
	void display(String x,int y,int z) 
	{
		
		pname=x;
		pcode=y;
		price=z;
	}
}
public class Product {
	public static void main(String[] args) {
		
		Cost p1= new Cost();
		Cost p2= new Cost();
		Cost p3= new Cost();
		
		p1.display("Oppo", 123, 12000);
		p2.display("Vivo", 124, 13000);
		p3.display("Realme", 125, 14000);
		
		if(p1.price < p2.price && p1.price < p3.price)
		{
			System.out.println("Low budget phone is "+p1.pname);
		}
		if(p2.price < p1.price && p2.price < p3.price) 
		{
			System.out.println("Low budget phone is "+p2.pname);
		}
		if(p3.price < p1.price && p3.price < p2.price)
		{
			System.out.println("Low budget phone is "+p3.pname);
		}
	}
}
