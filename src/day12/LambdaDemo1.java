package day12;

public class LambdaDemo1 {
	
	@FunctionalInterface
	interface Calc{
		int getResult(int x,int y);
	}

	public static void main(String[] args) {
		Calc calc1=new Calc() {
		
			@Override
			public int getResult(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		};
		System.out.println(calc1.getResult(80, 90));
		//-----------------------------------------
		Calc calc2=(int x,int y)->{return x-y;};
		System.out.println(calc2.getResult(70, 60));
		//-----------------------------------------
		Calc calc3=(x,y)-> x*y;
		System.out.println(calc3.getResult(50, 60));
		//-----------------------------------------
		print(50, 40, calc3);
		print(40, 20, (x,y)->x/y);
	}
	
	public static void print(int x,int y, Calc calc) {
		System.out.println(calc.getResult(x, y));
	}

}
