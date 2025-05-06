package day02;


//上衣設計
public class Top {
	String name;
	int price;
	
	public Top(String name,int price) {
		this.name=name;
		this.price=price;
	}
	public void printInfo(){
		System.out.printf("%s $%d%n",name,price);
	}
	
}
