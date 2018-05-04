package com.gulamjan.t022.华为取近似值;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			float f = in.nextFloat();
			System.out.println(getApproximation(f));
		}
		in.close();
	}
	
	public static int getApproximation(float f) {
		int n = (int)f;
		if ((f-n) >= 0.5) {
			return n+1;
		}else {
			return n;
		}
	}
}
