package day02;


//帽子設計
public class Bottom {
	String name;
	int price;
	
	public Bottom(String name,int price) {
		this.name=name;
		this.price=price;
	}
	public void printInfo(){
		System.out.printf("%s $%d%n",name,price);
	}
	
}
