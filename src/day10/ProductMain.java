package day10;

import java.util.stream.Stream;

public class ProductMain {

	public static void main(String[] args) {
		Toner toner=new Toner("玫瑰保濕化妝水", 850);
		Lotion lotion=new Lotion("玻尿酸乳液", 1250);
		Serum serum=new Serum("維他命C精華液", 1680);
		
		FaceWash faceWash=new FaceWash("男性控油洗面乳", 120);
		Aftershave aftershave=new Aftershave("清爽鬍鬚水", 250);
		HairGel hairGel=new HairGel("自然造型髮雕", 199);
		
		toner.refreshSkin();
		lotion.moisture();
		serum.repairSkin();
		faceWash.deepClean();
		aftershave.sootheskin();
		hairGel.styleHair();
		
		
		/*
		System.out.printf("%s $%,d%n",toner.name,toner.price);
		System.out.printf("%s $%,d%n",lotion.name,lotion.price);
		System.out.printf("%s $%,d%n",serum.name,serum.price);
		*/
		
		Product[] products= {toner,lotion,serum,faceWash,aftershave,hairGel};
		
		Stream.of(products).forEach(p->System.out.printf("%s $%,d%n",p.getName(),p.getPrice()));
		
		int sum=Stream.of(products)
				.mapToInt(p->p.getPrice())
				.sum();
		
		
		int total=0;
		for(Product product:products) {
			total+=product.getPrice();
		}
		System.out.println(total);
 	}

}
