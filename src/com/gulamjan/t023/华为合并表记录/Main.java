package com.gulamjan.t023.华为合并表记录;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		while (in.hasNext()) {
			int n = in.nextInt();
			
			for (int i = 0; i < n; i++) {
				int key = in.nextInt();
				int value = in.nextInt();
				if (map.containsKey(key)) {
					 map.put(key, map.get(key)+value);
				}else {
					map.put(key, value);
				}
			}
			for (Integer k : map.keySet()) {
				System.out.println(k+" "+map.get(k));
			}
		}
		in.close();
	}
}
