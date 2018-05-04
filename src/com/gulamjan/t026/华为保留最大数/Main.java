package com.gulamjan.t026.华为保留最大数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String n = in.next();
			int m = in.nextInt();
			System.out.println(maxNum(n, m));
		}
		in.close();
	}
	
	public static String  maxNum(String  n ,int m) {
		while (m-- > 0) {
			char[] array = n.toCharArray();
			String smin = String.valueOf(array[0]);
			int minValue = Integer.parseInt(smin);
			for (int i = 1; i < array.length; i++) {
				String s = String.valueOf(array[i]);
				int value = Integer.parseInt(s);
				if (minValue > value) {
					 minValue = value;
				}
			}
			n = n.replaceFirst(String.valueOf(minValue), "");
		}
		return  n;
	}
//	public static String getMinValue(String n) {
//		char[] array = n.toCharArray();
//		String smin = String.valueOf(array[0]);
//		return smin;
//	}
}
