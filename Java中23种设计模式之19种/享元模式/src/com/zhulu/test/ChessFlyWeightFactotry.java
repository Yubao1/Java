package com.zhulu.test;

import java.util.HashMap;
import java.util.Map;

public class ChessFlyWeightFactotry {
    private static Map<String, ChessFlyWeight> map = new HashMap<String,ChessFlyWeight>();
    public static ChessFlyWeight getChess(String color){
    	if (map.get(color) != null) {
    		return map.get(color);
    	} else {
			ChessFlyWeight chessFlyWeight = new ConcreteChess(color);
			map.put(color, chessFlyWeight);
			return chessFlyWeight;
		}
    }
}
