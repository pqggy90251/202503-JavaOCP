package day19;

public class ZeroValueException extends Exception{
	
	public ZeroValueException (String message) {
		super(message);
	}
	
	public void how2Do() {
		System.out.println("請重新定義資料：資料不可為0");
	}

}
