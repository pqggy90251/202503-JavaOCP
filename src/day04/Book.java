package day04;

public class Book {

	private String name;
	private int price;
	private int pages;
	
	
	//若沒寫建構子則 Java 會自動產生,所產生的建構子稱為預設建構子,其結構如下所述：
	//無參數建構子
	public Book() {
		System.out.println("呼叫 Book() 建構子");
	}
	
	//有參數建構子
	public Book(String name,int price,int pages) {
		setName(name);
		setPages(pages);
		setPrice(price);
	}
	
	
	//--------------------------
	public void setName(String name) {
		this.name=name;
	}
	
	public void setPrice(int price) {
		if(price>0) {
			this.price=price;
		}else {
			System.out.println("價格輸入錯誤!");
		}
	}
	public void setPages(int pages) {
		if(pages>0) {
			this.pages=pages;
		}else {
			System.out.println("頁數輸入錯誤!");
		}
	}
	//--------------------------
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getPages() {
		return pages;
	}


	public void printInfo() {
		System.out.printf("書名:%s 價格:%d 頁數:%d頁%n",name,price,pages);
	}
	
	
}
