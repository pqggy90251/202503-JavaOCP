package day09.case2;

// 小吃店(台灣第一家鹽酥雞專賣店)
public class SnackStore {

	public static void main(String[] args) {
		SaltedChicken saltedChicken = new SaltedChicken("鹽酥雞", 60);
		Tempura tempura = new Tempura("甜不辣", 30);
		Tofu tofu = new Tofu("百頁豆腐", 25);
	
		int total=0;
		AbstractSnack[] abstractSnacks= {saltedChicken,tempura,tofu};
		for(AbstractSnack abstractSnack:abstractSnacks) {
			abstractSnack.makeSnack();
			total+=abstractSnack.price;
		}
		System.out.println("總共:"+total+"元");
		
		//Snack[] snacks={saltedChicken,tempura,tofu};
		
	}
}