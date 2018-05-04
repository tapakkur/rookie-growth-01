package com.gulamjan.t018.华为统计不同字符;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String string = in.next();
			System.out.println(statistics(string));
		}
		in.close();
	}
	public static int statistics(String string) {
		Set<String> set = new HashSet<String>();
		char array[] = string.toCharArray();
		for (int i = 0; i < array.length; i++) {
			set.add(String.valueOf(array[i]));
		}
		return set.size();
	}
}
