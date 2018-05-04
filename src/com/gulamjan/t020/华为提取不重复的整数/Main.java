package com.gulamjan.t020.华为提取不重复的整数;

import java.util.LinkedHashSet;
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
	public static String statistics(String string) {
		Set<String> set = new LinkedHashSet<String>();
		char array[] = string.toCharArray();
		for (int i = array.length-1; 0 <= i; i--) {
			set.add(String.valueOf(array[i]));
		}
		Object objArray[] = set.toArray();
		String tempString = "";
		for (int i = 0; i < objArray.length ; i++) {
			tempString += objArray[i];
		}
		return tempString;
	}
}

