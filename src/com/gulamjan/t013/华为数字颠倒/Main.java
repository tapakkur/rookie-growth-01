package com.gulamjan.t013.»ªÎªÊı×Öµßµ¹;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			inversion(n);
		}
		in.close();
	}
	public static void inversion(int n) {
		String string = String.valueOf(n);
		char[] array = string.toCharArray();
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i]);
		}
	}
}
