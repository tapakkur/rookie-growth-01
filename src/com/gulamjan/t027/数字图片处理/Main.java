package com.gulamjan.t027.Êý×ÖÍ¼Æ¬´¦Àí;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String string = in.nextLine();
			char array [] = string.toCharArray();
			Arrays.sort(array);
			System.out.println(array);
		}
		in.close();
	}

}
