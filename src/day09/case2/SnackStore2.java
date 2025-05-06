package day09.case2;

public class SnackStore2 {

	public static void main(String[] args) {
		SaltedChicken saltedChicken = new SaltedChicken("鹽酥雞", 60);
		saltedChicken.setSize(-2);
		//saltedChicken.setSize(5);
		System.out.printf("%s 份量:%d 價格:%d%n",saltedChicken.getName()
				,saltedChicken.getSize(),saltedChicken.getPrice());
		saltedChicken.makeSnack();
		Tempura tempura = new Tempura("甜不辣", 30);
		Tofu tofu = new Tofu("百頁豆腐", 25);
	}

}
