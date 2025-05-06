package day02;

public class McDonalds {

	public static void main(String[] args) {
		//單點
		FastFood m1=new FastFood("主餐", "麥香魚", 45);
		FastFood m2=new FastFood("主餐", "大麥克", 78);
		FastFood s1=new FastFood("副餐", "中薯", 55);
		FastFood s2=new FastFood("副餐", "沙拉", 45);
		FastFood d1=new FastFood("飲品", "熱咖啡", 48);
		FastFood d2=new FastFood("飲品", "雪碧", 40);
		
		//套餐
		FastFood[] no1= {m2,s1,d1};
		FastFood[] no2= {m1,s2,d2};
		
		//單點菜單
		System.out.println("單點菜單");
		FastFood[] fastFood= {m1,m2,s1,s2,d1,d2};
		for(FastFood i:fastFood) {
			i.printInfo();
		}
		//套餐菜單
		System.out.println("套餐菜單");
		System.out.println("=====一號餐=====");
		int total1=0;
		for(FastFood i:no1) {
			i.printInfo();
			total1+=i.price;
		}
		System.out.printf("一號餐: $%d%n",total1);
		System.out.println("=====二號餐=====");
		int total2=0;
		for(FastFood i:no2) {
			i.printInfo();
			total2+=i.price;
		}
		System.out.printf("二號餐: $%d%n",total2);
		
	}

}
