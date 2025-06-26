package day19;

public class EmptyValueException extends Exception{
	
	public EmptyValueException (String message) {
		super(message);
	}
	
	public void how2Do() {
		System.out.println("請重新定義資料");
	}

}
