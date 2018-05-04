package com.gulamjan.t009.²»Òª¶þ;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int W = in.nextInt();
			int H = in.nextInt();
			System.out.println(cakeNum(W, H));
		}
		in.close();
	}
	public static int  cakeNum(int W ,int H) {
		int result = 0;
		if (W % 4 == 0 || H % 4 == 0) {
			result = W * H / 2;
		}else {
			result = W * H / 2 + 1;
		}
		return result;
	}
}
