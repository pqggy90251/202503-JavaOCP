package day17;

import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<String, Integer> lotsMap;
		Map<String, Integer> pointMap;
		Map<String, Integer> entryMap;
		Map<String, Integer> marketMap;
		
		lotsMap  =Map.of("台指期",2    ,"原油期",1    ,"黃金期",3);
		pointMap =Map.of("台指期",200  ,"原油期",1000 ,"黃金期",50);
		entryMap =Map.of("台指期",17250,"原油期",78   ,"黃金期",2020);
		marketMap=Map.of("台指期",17410,"原油期",75   ,"黃金期",2035);
		
		for(String symbol:lotsMap.keySet()) {
			
		}

	}

}
