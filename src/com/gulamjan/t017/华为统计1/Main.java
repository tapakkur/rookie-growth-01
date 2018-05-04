package com.gulamjan.t017.华为统计1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			System.out.println(statistic(n));
		}
		in.close();
	}
	
	public static int statistic(int n) {
		int counter = 0;
		while(n != 0){
			if (n % 2 == 1) {
				counter++;
			}
			n = n / 2;
		}
		return counter;
	}
}
