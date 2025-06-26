package day15;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List<Integer> scores=new ArrayList();
		scores.add(95);
		scores.add(100);
		scores.add(100);
		scores.add(100);
		scores.add(1,80);
		System.out.println(scores);
		
		System.out.println(scores.get(0));
		System.out.println(scores.size()-1);
		
		for(int i=0,lens=scores.size();i<lens;i++) {
			System.out.println(scores.get(i));
		}
		for(Integer score:scores) {
			System.out.println(score);
		}
		
		scores.forEach(score->System.out.println(score));
		
	}

}
