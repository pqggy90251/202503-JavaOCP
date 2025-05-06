package day02;

//全套服裝設計
public class Outfit {
	
	String name;
	Top top;
	Bottom bottom;
	Hat hat;
	int price;
	
	public Outfit(String name,Top top,Bottom bottom,Hat hat) {
		this.name=name;
		this.top=top;
		this.bottom=bottom;
		this.hat=hat;
		this.price=top.price+bottom.price+hat.price;
	}
	
	public void printInfo() {
		
		System.out.printf("風格名稱: %s 總價: $%d%n",name,price);
		top.printInfo();
		bottom.printInfo();
		hat.printInfo();
		System.out.println("-------------------");
	}
	
}
