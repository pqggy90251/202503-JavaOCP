package day18;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// 遊戲
		Map<Integer, String> gameMap = Map.of(0, "剪刀", 1, "石頭", 2, "布");
		// 結果
		Map<Integer, String> winnerMap = Map.of(0, "平手", 1, "user贏", 2, "pc贏");
		// 用 Scanner 來與電腦玩剪刀石頭布
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入剪刀(0) 石頭(1) 布(2) => ");
		
		try {
			int user = scanner.nextInt();
			int pc = new Random().nextInt(3); // 0, 1, 2
			System.out.printf("user => %s, pc => %s%n", gameMap.get(user), gameMap.get(pc));
			// 判定勝負
			int result = (user - pc + 3) % 3;
			// 誰贏
			System.out.println(winnerMap.get(result));
		} catch (InputMismatchException e) {
			System.out.println("輸入資料不正確, 錯誤類型:" + e.getClass().getSimpleName());
		}
		System.out.println("=============");
//		String winner=(result == 0) ? "平手" : 
//		              (result == 1) ? "user win" : 
//		               "pc win";
//		System.out.println(winner);
//		System.out.println("=============");
//		if(result==0) {
//			System.out.println("平手");			
//		}else if(result==1) {
//			System.out.println("user win");
//		}else if(result==2) {
//			System.out.println("pc win");
//		}
		
		scanner.close();
	}

}