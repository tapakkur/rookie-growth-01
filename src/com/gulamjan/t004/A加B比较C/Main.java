package com.gulamjan.t004.A¼ÓB±È½ÏC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Boolean> list = new ArrayList<Boolean>();
		int n = in.nextInt();
		while(n-- > 0){
			long a = in.nextLong();
			long b = in.nextLong();
			long c = in.nextLong();
			if (a+b > c) {
				list.add(true);
			}else {
				list.add(false);
			}
		}
		int i = 1;
		for (Boolean boolean1 : list) {
			System.out.println("Case #"+(i++)+": "+boolean1);
		}
		in.close();
	}
}


