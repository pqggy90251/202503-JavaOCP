package day09.case2;

public abstract class AbstractSnack implements Snack{

	protected String name;
	protected int price;
	private final int fixedPrice;
	protected int size=1;
	private final String[] sizeName= {"","小","中","大","特大","全家福"};

	public AbstractSnack(String name, int price) {
		
		this.name = name;
		this.price = price;
		fixedPrice = price;
	}
	public void setSize(int size) {
		if(size<0||size>5) {
			System.out.println("輸入錯誤，請重新輸入");
			return;
		}
		this.size=size;
		this.price = this.fixedPrice*this.size;
	}
	public int getSize() {
		return size;
	}

	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public void serve() {
		System.out.printf("將 %s 撒上胡椒粉後裝入紙袋%n",name);
		
	}
	
	public void makeSnack() {
		System.out.printf("===== 開始製作:%s(%s份) =====%n", name,sizeName[size]);
		
				
		
		
		prepare();
		cook();
		serve();
		System.out.printf("===== 售價:NT %d =====%n", price);
		System.out.printf("===== 製作完成:%s =====%n", name);
	}
}
