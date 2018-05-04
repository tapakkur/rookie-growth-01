package com.gulamjan.t025.华为求数列的和;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int m = in.nextInt();
			getResult(n, m);
		}
		in.close();
	}
	public static void getResult(int n ,int m) {
		double sum = 0;
		double x = (double)n;
		for (int i = 0; i < m; i++) {
			sum += x;
			x = Math.sqrt(x);
		}
		System.out.println(new DecimalFormat("#.00").format(sum));
	}
}
