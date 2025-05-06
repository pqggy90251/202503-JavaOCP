package day13;

public class MeatBallStore {
	
	public static void main(String[] args) {
		MeatBall meatBall1=new MeatBall("豬肉", true, 55);
		MeatBall meatBall2=new MeatBall("豬肉", true, 55);
		System.out.println(meatBall1);
		System.out.println(meatBall2);
		System.out.println(meatBall1==meatBall2);
		System.out.println(meatBall1.equals(meatBall2));
		
		
	}

}
