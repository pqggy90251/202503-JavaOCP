package day02;


//褲子/裙子設計
public class Hat {
	String name;
	int price;
	
	public Hat(String name,int price) {
		this.name=name;
		this.price=price;
	}
	public void printInfo(){
		System.out.printf("%s $%d%n",name,price);
	}
	
}
