package day02;

public class FastFood {

	String type;
	String name;
	int price;

	public FastFood(String type, String name, int price) {
		this.type = type;
		this.name = name;
		this.price = price;
	}
	
	public void printInfo(){
		System.out.printf("%s %s\t$%d%n",type,name,price);
	}
}
